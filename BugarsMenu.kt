class BugarsMenu {

//     var name : String = "",
//       var price : Double = 0.0,
//       var ingr : String = "",) {


    //
//       fun order() {
//           val BugarsMenu: List<BugarsMenu> = listOf(
//               ShackBurger("쉑쉑버거", 6900.0 , "토마토, 양상추, 쉑소스가 토핑된 치즈버거") ,
//               SmokeShack("스모커쉑쉑",8900.0,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"  ),
//               Cheseburger("치즈버거", 6900.0,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
//               Hamburger("햄버거",5400.0,"비프패티를 기반으로 야채가 들어간 기본버거")
//
//           //fun od는  when 조건문을 줄여놓은것.
//
//           )
//           val toInt = readln().toInt()
//           when (toInt) {
//               1, 2, 3, 4 -> BugarsMenu[0].order()
//               else -> {
//                   println("뒤로가기")
//                   KioskStarter().start()
//               }
//           }
//       }
//   }
    //
    fun order() {
        println("[ Burgers MENU ]")
        println("1.ShackBurger")
        println("2.SmokeShack")
        println("3.Cheeseburger")
        println("4.Hamburger")
        println("0.뒤로가기")

        when (readln().toInt()) {
            1 -> ShackBurger().order()
            2 -> SmokeShack().order()
            3 -> Cheeseburger().order()
            4 -> Hamburger().order()
            0 -> {
                println("뒤로가기")
                KioskStarter().start()
            }
        }


    }
}