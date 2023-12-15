class Drinks {
    fun order2(){
        println("[Drinks menu]")
        println("1.Shack Made Lemonade")
        println("2.Ice tea")
        println("3.Fifty")
        println("0.뒤로가기")

        when (readln().toInt()){
            1-> ShackMadeLemonade().order2()
            2-> ICEtea().order2()
            3-> Fifty().order2()
            0 -> { println("뒤로가기")
            KioskStarter().start()
            }

        }
    }
}