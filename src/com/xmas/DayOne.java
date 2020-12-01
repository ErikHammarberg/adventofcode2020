package com.xmas;

import java.util.Arrays;

public class DayOne {

    public static void main(String[] args) {
	      var inputs = Arrays.stream(input.split("\n")).mapToInt(val -> Integer.parseInt(val)).toArray();
        System.out.println("Answer one: " + puzzleOne(inputs));
        System.out.println("Answer two: " + puzzleTwo(inputs));
    }

    public static int puzzleOne(int[] inputs) {
        int term1, term2 = -1;

        for(int i = 0; i < inputs.length; i++) {

            for(int j = i+1 ; j < inputs.length; j++) {
                if(inputs[i] + inputs[j] == 2020) {
                    return inputs[i] * inputs[j];
                }
            }
        }
        throw new RuntimeException("Answer not found");
    }

    public static int puzzleTwo(int[] inputs) {
        int term1, term2, term3 = -1;

        for(int i = 0; i < inputs.length; i++) {
            for(int j = i+1 ; j < inputs.length; j++) {
                for(int k = j + 1; k< inputs.length; k++) {
                    if(inputs[i] + inputs[j] + inputs[k] == 2020) {
                        return inputs[i] * inputs[j] * inputs[k];
                }

                }
            }
        }
        throw new RuntimeException("Answer not found");
    }





    static String input =
        "1645\n"
        + "1995\n"
        + "1658\n"
        + "1062\n"
        + "1472\n"
        + "1710\n"
        + "1424\n"
        + "1823\n"
        + "1518\n"
        + "1656\n"
        + "1811\n"
        + "1511\n"
        + "1320\n"
        + "1521\n"
        + "1395\n"
        + "1996\n"
        + "1724\n"
        + "1666\n"
        + "1637\n"
        + "1504\n"
        + "1766\n"
        + "534\n"
        + "1738\n"
        + "1791\n"
        + "1372\n"
        + "1225\n"
        + "1690\n"
        + "1949\n"
        + "1495\n"
        + "1436\n"
        + "1166\n"
        + "1686\n"
        + "1861\n"
        + "1889\n"
        + "1887\n"
        + "997\n"
        + "1202\n"
        + "1478\n"
        + "833\n"
        + "1497\n"
        + "1459\n"
        + "1717\n"
        + "1272\n"
        + "1047\n"
        + "1751\n"
        + "1549\n"
        + "1204\n"
        + "1230\n"
        + "1260\n"
        + "1611\n"
        + "1506\n"
        + "1648\n"
        + "1354\n"
        + "1415\n"
        + "1615\n"
        + "1327\n"
        + "1622\n"
        + "1592\n"
        + "1807\n"
        + "1601\n"
        + "1026\n"
        + "1757\n"
        + "1376\n"
        + "1707\n"
        + "1514\n"
        + "1905\n"
        + "1660\n"
        + "1578\n"
        + "1963\n"
        + "1292\n"
        + "390\n"
        + "1898\n"
        + "1019\n"
        + "1580\n"
        + "1499\n"
        + "1830\n"
        + "1801\n"
        + "1881\n"
        + "1764\n"
        + "1442\n"
        + "1838\n"
        + "1088\n"
        + "1087\n"
        + "1040\n"
        + "1349\n"
        + "1644\n"
        + "1908\n"
        + "1697\n"
        + "1115\n"
        + "1178\n"
        + "1224\n"
        + "1810\n"
        + "1445\n"
        + "1594\n"
        + "1894\n"
        + "1287\n"
        + "1676\n"
        + "1435\n"
        + "1294\n"
        + "1796\n"
        + "1350\n"
        + "1685\n"
        + "1118\n"
        + "1488\n"
        + "1726\n"
        + "1696\n"
        + "1190\n"
        + "1538\n"
        + "1780\n"
        + "1806\n"
        + "1207\n"
        + "1346\n"
        + "1705\n"
        + "983\n"
        + "1249\n"
        + "1455\n"
        + "2002\n"
        + "1466\n"
        + "1723\n"
        + "1227\n"
        + "1390\n"
        + "1281\n"
        + "1715\n"
        + "1603\n"
        + "1862\n"
        + "1744\n"
        + "1774\n"
        + "1385\n"
        + "1312\n"
        + "1654\n"
        + "1872\n"
        + "1142\n"
        + "1273\n"
        + "1508\n"
        + "1639\n"
        + "1827\n"
        + "1461\n"
        + "1795\n"
        + "1533\n"
        + "1304\n"
        + "1417\n"
        + "1984\n"
        + "28\n"
        + "1693\n"
        + "1951\n"
        + "1391\n"
        + "1931\n"
        + "1179\n"
        + "1278\n"
        + "1400\n"
        + "1361\n"
        + "1369\n"
        + "1343\n"
        + "1416\n"
        + "1426\n"
        + "314\n"
        + "1510\n"
        + "1933\n"
        + "1239\n"
        + "1218\n"
        + "1918\n"
        + "1797\n"
        + "1255\n"
        + "1399\n"
        + "1229\n"
        + "723\n"
        + "1992\n"
        + "1595\n"
        + "1191\n"
        + "1916\n"
        + "1525\n"
        + "1605\n"
        + "1524\n"
        + "1869\n"
        + "1652\n"
        + "1874\n"
        + "1756\n"
        + "1246\n"
        + "1310\n"
        + "1219\n"
        + "1482\n"
        + "1429\n"
        + "1244\n"
        + "1554\n"
        + "1575\n"
        + "1123\n"
        + "1194\n"
        + "1408\n"
        + "1917\n"
        + "1613\n"
        + "1773\n"
        + "1809\n"
        + "1987\n"
        + "1733\n"
        + "1844\n"
        + "1423\n"
        + "1718\n"
        + "1714\n"
        + "1923\n"
        + "1503\n";
}
