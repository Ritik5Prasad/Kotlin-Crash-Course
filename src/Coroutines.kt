
import kotlinx.coroutines.*

suspend fun uploadFiles(){
    println("File Upload Started ${Thread.currentThread().name}")
    delay(3000)
    println("File Upload Ended  ${Thread.currentThread().name}")
    
}
suspend fun loadImage(){
    println("Image Loading Started ${Thread.currentThread().name}")
    delay(3000)
    println("Image Loading Ended  ${Thread.currentThread().name}")
    
}


fun main()= runBlocking{
    println("App Started:${Thread.currentThread().name}")
    
    // Background Task
    val job1 = launch(Dispatchers.IO){
        uploadFiles()
    }
	val job2 = launch(Dispatchers.IO){
        loadImage()
    }
	
    job1.join()
	job2.join()

	println("App Ended: ${Thread.currentThread().name}")
	
}