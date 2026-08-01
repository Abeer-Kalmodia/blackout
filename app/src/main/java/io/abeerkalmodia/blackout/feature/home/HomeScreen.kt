package io.abeerkalmodia.blackout.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onStartClick: () -> Unit = {}
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        verticalArrangement = Arrangement.Top

    ) {

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "BLACKOUT",
            style = MaterialTheme.typography.displayMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Hide the display.\nNot your experience.",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(modifier = Modifier.height(32.dp))

        HorizontalDivider()

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Status",
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(12.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors()
        ) {

            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                Text(
                    text = "Overlay",
                    style = MaterialTheme.typography.labelLarge
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Not Running",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.primary
                )

            }

        }

        Spacer(modifier = Modifier.height(28.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = onStartClick
        ) {

            Text("Start BLACKOUT")

        }

        Spacer(modifier = Modifier.height(36.dp))

        HorizontalDivider()

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Today's Usage",
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(12.dp))

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                Text(
                    text = "Screen Hidden",
                    style = MaterialTheme.typography.labelLarge
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "0 min",
                    style = MaterialTheme.typography.headlineMedium
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Sessions",
                    style = MaterialTheme.typography.labelLarge
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "0",
                    style = MaterialTheme.typography.headlineMedium
                )

            }

        }

        Spacer(modifier = Modifier.weight(1f))

        HorizontalDivider()

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "BLACKOUT v1.0",
            style = MaterialTheme.typography.bodySmall
        )

    }

}