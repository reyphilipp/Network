import javax.swing.JFrame


fun main(args: Array<String>) {

    val frame = JFrame("Verwaltung Netzwerkteilnehmer")
    frame.contentPane = ClientGui().panelMain
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(800, 800)
    frame.isVisible = true


    println()
}


fun test(m:String){
    println(m)
}