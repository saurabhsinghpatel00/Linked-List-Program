def getRelevantFoodOutlets(city, maxCost):
     result = []
     baseUrl = "http://jsonmock.hackerrank.com/api/food_outlets?city=" + city
     total_pages = requests.get(baseUrl).json()["total_pages"]
     for page in range(total_pages):
         url = baseUrl + "&page=" + str(page + 1)
         data = requests.get(url).json()["data"]
          for i in range(len(data)):
             if data[i]["estimated_cost"] <= maxCost:
                 result.append(data[i]["name"])
      return result

   print(getRelevantFoodOutlets('Denver', 50))

  # BKC DIVE, Vedge print(getRelevantFoodOutlets('Houston', 30)) 
  # Nasi And Mee # Zaatar Arabic Restaurant # Milano Ice Cream
  # Thaal Kitchen # Alakapuri # Nawras Seafood Restaurant
  # Brindhavan Vegetarian Restaurant # Mustake Multicuisine Restaurant
  # Cocoa Tree 
