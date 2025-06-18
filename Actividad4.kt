@Composable
fun fullAnimateAsState(modifier: Modifier = Modifier) {
    var isSelected by remember { mutableStateOf(value: false) }
    val animatedColor by animateColorAsState(
        targetValue = if (isSelected) Color.Red else Color.Blue
    )

    val animatedSize by animateDpAsState(
        targetValue = if (isSelected) 300.dp else 150.dp
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
        Box(modifier = Modifier.size(animatedSize).background(animatedColor))
    }
}