//[keyple-less-reader-nfcmobile-kmp-lib](../../../index.md)/[org.eclipse.keyple.keypleless.reader.nfcmobile](../index.md)/[LocalNfcReader](index.md)/[transmitApdu](transmit-apdu.md)

# transmitApdu

[common, android, jvm]\
[common]\
expect fun [transmitApdu](transmit-apdu.md)(commandApdu: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

[android, jvm]\
actual fun [transmitApdu](transmit-apdu.md)(commandApdu: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

Transmits an Application Protocol Data Unit (APDU) command to the smart card and receives the response.

#### Return

The response APDU received from the smart card.

<exception cref="ReaderNotFoundException">If the communication with the reader has failed.</exception><exception cref="CardIOException">If the communication with the card has failed.</exception>

#### Parameters

common

| | |
|---|---|
| commandApdu | : The command APDU to be transmitted. |

android

| | |
|---|---|
| commandApdu | : The command APDU to be transmitted. |

jvm

| | |
|---|---|
| commandApdu | : The command APDU to be transmitted. |
