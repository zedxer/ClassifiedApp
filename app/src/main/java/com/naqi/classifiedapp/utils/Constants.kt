package com.naqi.classifiedapp.utils

object Constants {
    //network constants
    const val BASE_URL: String = "https://ey3f2y0nre.execute-api.us-east-1.amazonaws.com/default/"
    const val LISTING_ENDPOINT = "dynamodb-writer"

    //data keys
    const val ID_KEY = "ID_KEY"
    const val ITEM_CREATION_KEY = "ITEM_CREATION_KEY"
    const val ITEM_NAME_KEY = "ITEM_NAME_KEY"
    const val ITEM_PRICE_KEY = "ITEM_PRICE_KEY"
    const val ITEM_JSON_KEY = "ITEM_JSON_KEY"

    //this is very long string
    const val SAMPLE_JSON = "{\n" +
            "    \"results\": [\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-24 04:04:17.566515\",\n" +
            "            \"price\": \"AED 5\",\n" +
            "            \"name\": \"Notebook\",\n" +
            "            \"uid\": \"4878bf592579410fba52941d00b62f94\",\n" +
            "            \"image_ids\": [\n" +
            "                \"9355183956e3445e89735d877b798689\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/9355183956e3445e89735d877b798689?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=m%2B%2BVviOGqeWM%2BamfnNldKqkWxaM%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733620\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/9355183956e3445e89735d877b798689-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=A0ztsQm6fYQuVpDDC2o8IoXi6sM%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733620\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-23 07:56:26.686128\",\n" +
            "            \"price\": \"AED 500\",\n" +
            "            \"name\": \"Glasses\",\n" +
            "            \"uid\": \"bdf455e89f3b49f484d2a181b0268eab\",\n" +
            "            \"image_ids\": [\n" +
            "                \"46a0c97762ba449cb49b3575681a4d84\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/46a0c97762ba449cb49b3575681a4d84?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=iKumqrAir61u2YnEpz022Tno8Lo%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733620\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/46a0c97762ba449cb49b3575681a4d84-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=GX77Y7A1ORRp54nvV73mkwUF11U%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733620\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-27 11:21:59.983164\",\n" +
            "            \"price\": \"AED 600\",\n" +
            "            \"name\": \"monitor\",\n" +
            "            \"uid\": \"b27233dd372543ffae38cce03ea9f047\",\n" +
            "            \"image_ids\": [\n" +
            "                \"5cfcab40ab9048c0b265468b9eea8cd8\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/5cfcab40ab9048c0b265468b9eea8cd8?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=aeO8xNwnP5TKMg2v7olDXl2vg7s%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733620\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/5cfcab40ab9048c0b265468b9eea8cd8-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=sk2OLPoo6vYv1cLkne%2Fa17JAp3E%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733620\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-23 11:40:26.022080\",\n" +
            "            \"price\": \"AED 600\",\n" +
            "            \"name\": \"acoustic guitar\",\n" +
            "            \"uid\": \"130f46715a20423896606703bb783eda\",\n" +
            "            \"image_ids\": [\n" +
            "                \"920ccd0ccd664699aed8b4e09ea55096\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/920ccd0ccd664699aed8b4e09ea55096?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=hGKBV1YecpdMyy0oxxKKbA%2BOMLk%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733620\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/920ccd0ccd664699aed8b4e09ea55096-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=hzfCvCX958vhsWt%2FJV9Xqg5%2F%2Bok%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733620\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-23 11:45:26.684315\",\n" +
            "            \"price\": \"AED 5\",\n" +
            "            \"name\": \"Pen\",\n" +
            "            \"uid\": \"22c5b4fbec0149d7be23ddaec5d743c5\",\n" +
            "            \"image_ids\": [\n" +
            "                \"80cf682cc0b4425d9aed74e49ae656be\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/80cf682cc0b4425d9aed74e49ae656be?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=kwdfeObmd1gExYRe1L5epgKwvoI%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733620\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/80cf682cc0b4425d9aed74e49ae656be-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=DQRwLB5ysKYACfMljY22djfXi4g%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733621\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-24 03:44:27.587018\",\n" +
            "            \"price\": \"AED 100\",\n" +
            "            \"name\": \"Hat\",\n" +
            "            \"uid\": \"8e72663c6057482386f318b0ff2e8be2\",\n" +
            "            \"image_ids\": [\n" +
            "                \"9662015c1f1c4226ad026ddc3390213d\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/9662015c1f1c4226ad026ddc3390213d?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=DtT8WMrt9n4tMf4lvtdMtA9%2Bxjw%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733621\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/9662015c1f1c4226ad026ddc3390213d-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=J3MQFtp0201y%2Bt13L5Wvrb78YBA%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733621\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-23 11:28:04.222234\",\n" +
            "            \"price\": \"AED 450\",\n" +
            "            \"name\": \"sunglass\",\n" +
            "            \"uid\": \"65dbe8798b414873884ace02980387ec\",\n" +
            "            \"image_ids\": [\n" +
            "                \"7842cf27826844b99533144c72c3a379\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/7842cf27826844b99533144c72c3a379?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=qdgMC%2FamWRVKeYQFQVAQZwhcN6w%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733621\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/7842cf27826844b99533144c72c3a379-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=gEP78pFnx6Zw6F%2BjoXuJ7VEOAuM%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733621\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-24 02:34:54.942502\",\n" +
            "            \"price\": \"AED 12\",\n" +
            "            \"name\": \"coffee mug\",\n" +
            "            \"uid\": \"244fe7e3d6e54fd18c72f5ab75e34822\",\n" +
            "            \"image_ids\": [\n" +
            "                \"f12fbe72ae0d4ce281f53265f2d36e71\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/f12fbe72ae0d4ce281f53265f2d36e71?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=hJKS6MCQQgrMGnc4BDVSWWxzol4%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733621\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/f12fbe72ae0d4ce281f53265f2d36e71-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=aBhZSwVZTFgYBpStG%2FLKuyxfMSE%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733621\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-03-07 16:41:41.115808\",\n" +
            "            \"price\": \"AED 45000\",\n" +
            "            \"name\": \"sports car, sport car\",\n" +
            "            \"uid\": \"e1146fea627d4e40a22282e3e92d00ec\",\n" +
            "            \"image_ids\": [\n" +
            "                \"a4afcbffb07f43ec85909346c1ba5cd5\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/a4afcbffb07f43ec85909346c1ba5cd5?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=3%2FhLu21t3XJu94c9j8SXw7G8Ai8%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733621\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/a4afcbffb07f43ec85909346c1ba5cd5-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=nNQvMiRUQ694d1%2BlyETu9bBIuOE%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733621\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-09-23 12:42:41.434262\",\n" +
            "            \"price\": \"AED 800\",\n" +
            "            \"name\": \"studio couch, day bed\",\n" +
            "            \"uid\": \"efcbb9de74364f2b982623d4f03a0386\",\n" +
            "            \"image_ids\": [\n" +
            "                \"d94ea3ca5a1e424684edd1675776fd47\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/d94ea3ca5a1e424684edd1675776fd47?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=mtqm8cz%2BfQSk1Y5XYRdK49BGtZo%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733621\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/d94ea3ca5a1e424684edd1675776fd47-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=n086r9F6feHOLJfvJDixBvmCGaM%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733622\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-23 11:29:41.642087\",\n" +
            "            \"price\": \"AED 250\",\n" +
            "            \"name\": \"table lamp\",\n" +
            "            \"uid\": \"f75dfaa3a9d4485581cd2d49ca02d7a1\",\n" +
            "            \"image_ids\": [\n" +
            "                \"03f55185a03e4760a66d3001b7cc6506\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/03f55185a03e4760a66d3001b7cc6506?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=sgdIdLODXYsHMz9bF8LuoCjIojk%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733622\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/03f55185a03e4760a66d3001b7cc6506-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=BLGtnK1vlBRaVWPd%2BwSAcHxbzsM%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733622\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-03-01 06:34:17.284919\",\n" +
            "            \"price\": \"AED 65\",\n" +
            "            \"name\": \"dial telephone, dial phone\",\n" +
            "            \"uid\": \"b02862ced008434682f5e56eb325eaae\",\n" +
            "            \"image_ids\": [\n" +
            "                \"d236200a93d04c5a838bc1ae6c936753\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/d236200a93d04c5a838bc1ae6c936753?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=N7h9oX8UmACdcFlFOGlnvRnR4pg%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733622\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/d236200a93d04c5a838bc1ae6c936753-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=v20lF8LBf0FmINeWw6BFKVbPUak%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733622\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-24 06:26:21.752895\",\n" +
            "            \"price\": \"AED 25\",\n" +
            "            \"name\": \"Pen\",\n" +
            "            \"uid\": \"3eddd356004f4e90b7d4ca57ff62184a\",\n" +
            "            \"image_ids\": [\n" +
            "                \"23feec72a3b1496c83e619bdb616c95d\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/23feec72a3b1496c83e619bdb616c95d?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=6riqstgMqsK8nPpBafAGLL%2BjLRk%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733622\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/23feec72a3b1496c83e619bdb616c95d-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=UwDbDFij5ppRGoBtboL07Yz5Sb8%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733622\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-24 04:53:52.285705\",\n" +
            "            \"price\": \"AED 250\",\n" +
            "            \"name\": \"sunglasses, dark glasses, shades\",\n" +
            "            \"uid\": \"28ed7f5695474f87a672eecab8f5f771\",\n" +
            "            \"image_ids\": [\n" +
            "                \"61d555b138d74ee793e5664edbeb545f\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/61d555b138d74ee793e5664edbeb545f?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=PeriuVrAuIrX5OoMgKIG5Au9IuI%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733622\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/61d555b138d74ee793e5664edbeb545f-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=7R6G%2FTkmmd6IZ%2FpbFMiPZ9h73hI%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733622\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-25 05:45:46.643514\",\n" +
            "            \"price\": \"AED 75\",\n" +
            "            \"name\": \"Book\",\n" +
            "            \"uid\": \"ffdc6d7d51ad44babe02614b26c56245\",\n" +
            "            \"image_ids\": [\n" +
            "                \"a3ca30d2488e43e68d4109b991ff2b42\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/a3ca30d2488e43e68d4109b991ff2b42?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=mbMM7OqHRT1pn7Hc2QzIx5qfF%2BU%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733622\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/a3ca30d2488e43e68d4109b991ff2b42-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=1F4kgBaFDKxSF5cYuDlRPUmZg%2BE%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733623\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-23 11:47:52.822642\",\n" +
            "            \"price\": \"AED 12\",\n" +
            "            \"name\": \"Notebook \",\n" +
            "            \"uid\": \"74bd19c947cb4904be7a1bd9345de4d3\",\n" +
            "            \"image_ids\": [\n" +
            "                \"5210489479784ca8bd9e0ac583b4199a\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/5210489479784ca8bd9e0ac583b4199a?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=eXJT%2BZ0yEkjMvRnIT4xmvxqWHgI%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733623\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/5210489479784ca8bd9e0ac583b4199a-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=zAirKGbNLvfHV35%2FmCsQZDx9O9w%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733623\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-23 11:29:03.524622\",\n" +
            "            \"price\": \"AED 60\",\n" +
            "            \"name\": \"pineapple, ananas\",\n" +
            "            \"uid\": \"482ed483d36d498bac5b9b8c27de9421\",\n" +
            "            \"image_ids\": [\n" +
            "                \"1ab1a4b21d6747c9994d0dff3ff6c634\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/1ab1a4b21d6747c9994d0dff3ff6c634?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=xzL04Mg%2BHcObPYqo5rLq0pB7sZ0%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733623\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/1ab1a4b21d6747c9994d0dff3ff6c634-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=AgzQ3nmpPmASmirrMcvZJJhP%2Fqg%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733623\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-27 12:24:40.969061\",\n" +
            "            \"price\": \"AED 25\",\n" +
            "            \"name\": \"Notebook \",\n" +
            "            \"uid\": \"bb2882a984884d1f86e877c5194ee44e\",\n" +
            "            \"image_ids\": [\n" +
            "                \"6bda5343ed714ddf90af089de05fe9c6\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/6bda5343ed714ddf90af089de05fe9c6?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=1gh8s9J367WtJmoFy3SCGrYhV%2BY%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733623\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/6bda5343ed714ddf90af089de05fe9c6-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=ALJi94lvfPVgr3JhjwplhKMc4lc%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733623\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-04-15 13:38:53.687469\",\n" +
            "            \"price\": \"AED 50\",\n" +
            "            \"name\": \"book jacket, dust cover, dust jacket, dust wrapper\",\n" +
            "            \"uid\": \"82165781e3294de4b916541dfc6ad60e\",\n" +
            "            \"image_ids\": [\n" +
            "                \"9d002219af9c4374bfdf54730a745606\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/9d002219af9c4374bfdf54730a745606?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=lG%2Fq%2BnXYg4pglXy7m8Ryb9V%2BN2Q%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733623\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/9d002219af9c4374bfdf54730a745606-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=hiJiZ9K7HJ1Z6%2B6GBPIn2%2BrXgtg%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733623\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"created_at\": \"2019-02-23 11:11:01.282260\",\n" +
            "            \"price\": \"AED 45\",\n" +
            "            \"name\": \"mouse, computer mouse\",\n" +
            "            \"uid\": \"0fa43a3cb366475fb5d60fe1a208fe95\",\n" +
            "            \"image_ids\": [\n" +
            "                \"c96e82f913034c27b291a1722613f162\"\n" +
            "            ],\n" +
            "            \"image_urls\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/c96e82f913034c27b291a1722613f162?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=7kcgtWqbqKC1TkUavX5pYVfMgSY%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733623\"\n" +
            "            ],\n" +
            "            \"image_urls_thumbnails\": [\n" +
            "                \"https://demo-app-photos-45687895456123.s3.amazonaws.com/c96e82f913034c27b291a1722613f162-thumbnail?AWSAccessKeyId=ASIASV3YI6A4U3EO4IVQ&Signature=j5FYVKGZ5wv%2Bm5RRG0SsjVXFy6M%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMSJHMEUCIGD8fyxuw5AKnuSWPjG52Aqz4ife4FCfLWymOiVx%2B0RoAiEAnOLFfoxMbGIzYwNsv%2F%2FY0SrkIZQloUDdrBUexOWSA7QqnQII1f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARADGgwxODQzOTg5NjY4NDEiDJvVF434PovQok%2BlNCrxAQuwDS4%2FG47DTfwTKrtCInH9jdcdelH%2BQoX7EnZZ%2Bt3guRpb75W1rfq92R6xfxINcBfMc%2BAk%2BevQbpxITt9XPPp1lCZV0aMMbQyDWbpmABTh5JVSBPg6zYQPoB0w15ab%2BUwopSnvFbGM%2B96skGfxuu6QSErcyJS6le7p7udbuRXJiImOCTE7w%2BSRx5AqIk1p4jJbTpYg9SazTBFgNVorxbMlw9rQheMWuP2p5tS6seP3jD8pG9cFGBkfHFwQGiCCFdnAniaPqfX%2BZtf3QtVl00RU3ajP1z8ASOa%2FuqFuk%2FK457J%2FaDwzqjuf1BJ2MnbvqDgw%2BPy%2FiwY6mgEsKxE2zI8ukyj0dDJUSCnpRHIrCD7katLRaN1yKPH76K487cFg0ZvDXSqXi%2F57lwE55NJKQmWW8fcGr1fmzqmtSmR%2BA%2F%2FgYzpIZpfKU9%2F16pVV4ziinC%2BI%2BHFBXiCSqMt3rzCpLPJL6ABX%2FjrRt72cT2MRgkZwQ%2F0qL%2FK7aRSO2fu3D41DmOpzQ%2B3X12WRaRpHrldPIcK66BDY&Expires=1634733624\"\n" +
            "            ]\n" +
            "        }\n" +
            "    ],\n" +
            "    \"pagination\": {\n" +
            "        \"key\": null\n" +
            "    }\n" +
            "}"

    //
}