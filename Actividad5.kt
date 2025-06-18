@Composable
fun fullAnimateAsState(modifier: Modifier = Modifier) {
    var isSelected by remember { mutableStateOf(value: false) }
    val animatedColor by animateColorAsState(
        targetValue = if (isSelected) Color.Red else Color.Blue
    )
    val animatedSize by animateDpAsState(
        targetValue = if (isSelected) 200.dp else 150.dp
    )
    val animatedOffSet by animateOffsetAsState(
        targetValue = if (isSelected) Offset(x: 0f, y: 100f) else Offset(x: 0f, y: 0f)
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
        Box(modifier = Modifier
            .offset(animatedOffSet.x.dp, animatedOffSet.y.dp)
            .size(animatedSize)
            .background(animatedColor)
        )
    }
}