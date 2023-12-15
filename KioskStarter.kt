class KioskStarter {
    fun start(){
        var menu1 = BugarsMenu()
        var menu2 = Forzen()
        var menu3 = Drinks()

        println("[ SHAKESHACK MENU ]")
        println("1.Burgers")
        println("2.Forzen Custard")
        println("3.Drinks ")
        println("0.프로그램 종료")


        val pick = readln().toInt()
        when (pick)
        {
            1 -> menu1.order()
            2 -> menu2.order1()
            3 -> menu3.order2()
            0 -> { println("프로그램 종료")

            }
        }

    }
}
