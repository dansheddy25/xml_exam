<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>Relevé</title>
            </head>
            <body>
                <h1>Releves</h1>
                <xsl:for-each select="releve">
                    <p>Date relevé : <xsl:value-of select="dateReleve"></xsl:value-of> </p>
                    <p>RIB : <xsl:value-of select="@rib"></xsl:value-of> </p>
                    <p>Solde <xsl:value-of select="solde"></xsl:value-of> </p>
                    <table border="2">
                        <caption>Somme des Opérations</caption>
                        <thead>
                            <th>Type d'opération</th>
                            <th>Date</th>
                            <th>Montant</th>
                            <th>Description</th>
                        </thead>
                        <tbody>
                            <xsl:for-each select="operations">
                                <xsl:for-each select="operation[@type='credit']">
                                    <tr>
                                        <td> <xsl:value-of select="@type"></xsl:value-of> </td>
                                        <td> <xsl:value-of select="@date"></xsl:value-of> </td>
                                        <td> <xsl:value-of select="@montant"></xsl:value-of> </td>
                                        <td> <xsl:value-of select="@description"></xsl:value-of> </td>
                                    </tr>
                                </xsl:for-each>
                                <tr>
                                    <td colspan="2">Total des operations de crédit</td>
                                    <td colspan="2" align="center"> <xsl:value-of select="sum(operation[@type='credit']/@montant)"></xsl:value-of> </td>
                                </tr>
                            </xsl:for-each>
                        </tbody>
                    </table>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>