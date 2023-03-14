package com.my.cocktail.common.dto;

public class SwaggerNote {
    public final static String ITEM_READ_ALL_NOTE = """
                모든 상품 목록 조회
                GET /api/v1/cocktail
            
                ResponseBody
                {
                    "items": 
                    [
                        {
                                "id": 1,
                                "name": "아이템1",
                                "price": 10000,
                                "category": "FOOD",
                                "memberId": 1,
                                "description": "음식 상품입니다",
                                "auctionPeriod": 10,
                                "immediatelyPrice": 30000,
                                "state": "ACTIVE"
                        },
                        {
                                "id": 2,
                                "name": "아이템2",
                                "price": 10000,
                                "category": "LIFE",
                                "memberId": 1,
                                "description": "생활 상품입니다",
                                "auctionPeriod": 7,
                                "immediatelyPrice": 50000,
                                "state": "ACTIVE"
                        }
                    ]
                }
            """;

    public final static String ITEM_READ_ONE_NOTE = """
                상품 단건 조회
                GET /api/v1/items/{id}
            
                ResponseBody
                {
                     "id": 1,
                     "name": "아이템1",
                     "price": 10000,
                     "category": "FOOD",
                     "memberId": 1,
                     "description": "음식 상품입니다",
                     "auctionPeriod": 10,
                     "immediatelyPrice": 30000,
                     "state": "ACTIVE"
                 }
            """;

    public final static String COCKTAIL_CREATE_NOTE = """
                    칵테일 레시피 등록하기
                    POST /api/v1/cocktail       
                        
                    Request Body
                    {
                        "memberId" : 1,
                        "cocktailName" : "잭콕",
                        "cocktailMaterials" : [{ "name" : "잭 다니엘스", "ratio" : 1} , { "name" : "콜라", "ratio" : 3}],
                        "cocktailDescription" : "버번 위스키에 콜라를 섞어 마시는 버번 콕 바리에이션",
                        "degree" : 10
                    }
                        
                    Response Body
                    {
                              "id": 3,
                              "name": "아이템3",
                              "price": 30000,
                              "category": "FOOD",
                              "memberId": 1,
                              "description": "음식 상품입니다2",
                              "auctionPeriod": 4,
                              "immediatelyPrice": 35000,
                              "state": "ACTIVE"
                    }     
            """;
}