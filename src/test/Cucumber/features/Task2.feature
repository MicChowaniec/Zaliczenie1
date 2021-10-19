//Napisz skrypt, który:

//zaloguje się na tego samego użytkownika z zadania 1,
//wybierze do zakupu Hummingbird Printed Sweater (opcja dodatkowa: sprawdzi czy rabat na niego wynosi 20%),
//wybierze rozmiar M (opcja dodatkowa: zrób tak żeby można było sparametryzować rozmiar i wybrać S,M,L,XL),
//wybierze 5 sztuk według parametru podanego w teście (opcja dodatkowa: zrób tak żeby można było sparametryzować liczbę sztuk),
//dodaj produkt do koszyka,
//przejdzie do opcji - checkout,
//potwierdzi address (możesz go dodać wcześniej ręcznie),
//wybierze metodę odbioru - PrestaShop "pick up in store",
//wybierze opcję płatności - Pay by Check,
//kliknie na "order with an obligation to pay",
//zrobi screenshot z potwierdzeniem zamówienia i kwotą.

  Scenario Outline: Byuing a sweaters
  Given: Log in
  Given: Pick Hummingbird Printed Swater
  Given: Pick M  size
  Given: Pick 5 pieces
  Given: Add articles to basket
  Given: Adress confirmation
  Given: Choose "pick up in store"
  Given: Order with obligation to pay
  Then: Make a screenshot with purchase and value




