@Composable
fun fullAnimateAsState(modifier: Modifier = Modifier) {
    var isSelected by remember { mutableStateOf(value: false) }
    val animatedColor by animateColorAsState(
        targetValue = if (isSelected) Color.Red else Color.Blue
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(Modifier.height(32.dp))
        Button(onClick = { isSelected = !isSelected }) {
            Text(text: "Selecionar")
        }
        Spacer(Modifier.height(32.dp))
        Box(modifier = Modifier.size(150.dp).background(animatedColor))
    }
}