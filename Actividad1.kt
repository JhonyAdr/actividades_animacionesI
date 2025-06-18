@Composable
fun MyAnimatedVisibility(modifier: Modifier = Modifier) {
    var showView by remember { mutableStateOf(value: true) }
    Column(modifier = modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Spacer(Modifier.height(50.dp))
        Button(onClick = {showView=!showView}) {
            if(showView) {
                Text(text: "Mostrar/Ocular")
            }
        }
        Spacer(Modifier.height(50.dp))
        if(showView) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(Color.Red)
            )
        }
    }
}

