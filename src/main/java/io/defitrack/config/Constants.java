package io.defitrack.config;

public class Constants {

    public static String ERC20_ABI = "[\n" +
            "    {\n" +
            "        \"constant\": true,\n" +
            "        \"inputs\": [],\n" +
            "        \"name\": \"name\",\n" +
            "        \"outputs\": [\n" +
            "            {\n" +
            "                \"name\": \"\",\n" +
            "                \"type\": \"string\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"payable\": false,\n" +
            "        \"stateMutability\": \"view\",\n" +
            "        \"type\": \"function\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"constant\": false,\n" +
            "        \"inputs\": [\n" +
            "            {\n" +
            "                \"name\": \"_spender\",\n" +
            "                \"type\": \"address\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"name\": \"_value\",\n" +
            "                \"type\": \"uint256\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"name\": \"approve\",\n" +
            "        \"outputs\": [\n" +
            "            {\n" +
            "                \"name\": \"\",\n" +
            "                \"type\": \"bool\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"payable\": false,\n" +
            "        \"stateMutability\": \"nonpayable\",\n" +
            "        \"type\": \"function\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"constant\": true,\n" +
            "        \"inputs\": [],\n" +
            "        \"name\": \"totalSupply\",\n" +
            "        \"outputs\": [\n" +
            "            {\n" +
            "                \"name\": \"\",\n" +
            "                \"type\": \"uint256\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"payable\": false,\n" +
            "        \"stateMutability\": \"view\",\n" +
            "        \"type\": \"function\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"constant\": false,\n" +
            "        \"inputs\": [\n" +
            "            {\n" +
            "                \"name\": \"_from\",\n" +
            "                \"type\": \"address\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"name\": \"_to\",\n" +
            "                \"type\": \"address\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"name\": \"_value\",\n" +
            "                \"type\": \"uint256\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"name\": \"transferFrom\",\n" +
            "        \"outputs\": [\n" +
            "            {\n" +
            "                \"name\": \"\",\n" +
            "                \"type\": \"bool\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"payable\": false,\n" +
            "        \"stateMutability\": \"nonpayable\",\n" +
            "        \"type\": \"function\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"constant\": true,\n" +
            "        \"inputs\": [],\n" +
            "        \"name\": \"decimals\",\n" +
            "        \"outputs\": [\n" +
            "            {\n" +
            "                \"name\": \"\",\n" +
            "                \"type\": \"uint8\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"payable\": false,\n" +
            "        \"stateMutability\": \"view\",\n" +
            "        \"type\": \"function\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"constant\": true,\n" +
            "        \"inputs\": [\n" +
            "            {\n" +
            "                \"name\": \"_owner\",\n" +
            "                \"type\": \"address\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"name\": \"balanceOf\",\n" +
            "        \"outputs\": [\n" +
            "            {\n" +
            "                \"name\": \"balance\",\n" +
            "                \"type\": \"uint256\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"payable\": false,\n" +
            "        \"stateMutability\": \"view\",\n" +
            "        \"type\": \"function\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"constant\": true,\n" +
            "        \"inputs\": [],\n" +
            "        \"name\": \"symbol\",\n" +
            "        \"outputs\": [\n" +
            "            {\n" +
            "                \"name\": \"\",\n" +
            "                \"type\": \"string\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"payable\": false,\n" +
            "        \"stateMutability\": \"view\",\n" +
            "        \"type\": \"function\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"constant\": false,\n" +
            "        \"inputs\": [\n" +
            "            {\n" +
            "                \"name\": \"_to\",\n" +
            "                \"type\": \"address\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"name\": \"_value\",\n" +
            "                \"type\": \"uint256\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"name\": \"transfer\",\n" +
            "        \"outputs\": [\n" +
            "            {\n" +
            "                \"name\": \"\",\n" +
            "                \"type\": \"bool\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"payable\": false,\n" +
            "        \"stateMutability\": \"nonpayable\",\n" +
            "        \"type\": \"function\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"constant\": true,\n" +
            "        \"inputs\": [\n" +
            "            {\n" +
            "                \"name\": \"_owner\",\n" +
            "                \"type\": \"address\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"name\": \"_spender\",\n" +
            "                \"type\": \"address\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"name\": \"allowance\",\n" +
            "        \"outputs\": [\n" +
            "            {\n" +
            "                \"name\": \"\",\n" +
            "                \"type\": \"uint256\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"payable\": false,\n" +
            "        \"stateMutability\": \"view\",\n" +
            "        \"type\": \"function\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"payable\": true,\n" +
            "        \"stateMutability\": \"payable\",\n" +
            "        \"type\": \"fallback\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"anonymous\": false,\n" +
            "        \"inputs\": [\n" +
            "            {\n" +
            "                \"indexed\": true,\n" +
            "                \"name\": \"owner\",\n" +
            "                \"type\": \"address\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"indexed\": true,\n" +
            "                \"name\": \"spender\",\n" +
            "                \"type\": \"address\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"indexed\": false,\n" +
            "                \"name\": \"value\",\n" +
            "                \"type\": \"uint256\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"name\": \"Approval\",\n" +
            "        \"type\": \"event\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"anonymous\": false,\n" +
            "        \"inputs\": [\n" +
            "            {\n" +
            "                \"indexed\": true,\n" +
            "                \"name\": \"from\",\n" +
            "                \"type\": \"address\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"indexed\": true,\n" +
            "                \"name\": \"to\",\n" +
            "                \"type\": \"address\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"indexed\": false,\n" +
            "                \"name\": \"value\",\n" +
            "                \"type\": \"uint256\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"name\": \"Transfer\",\n" +
            "        \"type\": \"event\"\n" +
            "    }\n" +
            "]";


}
