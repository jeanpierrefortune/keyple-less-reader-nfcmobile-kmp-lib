//[keyple-less-reader-nfcmobile-kmp-lib](../../../index.md)/[org.eclipse.keyple.keypleless.reader.nfcmobile](../index.md)/[MultiplatformReader](index.md)

# MultiplatformReader

[common]\
class [MultiplatformReader](index.md)(nfcReader: [LocalNfcReader](../-local-nfc-reader/index.md))

## Constructors

| | |
|---|---|
| [MultiplatformReader](-multiplatform-reader.md) | [common]<br>constructor(nfcReader: [LocalNfcReader](../-local-nfc-reader/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [closePhysicalChannel](close-physical-channel.md) | [common]<br>fun [closePhysicalChannel](close-physical-channel.md)() |
| [getPowerOnData](get-power-on-data.md) | [common]<br>fun [getPowerOnData](get-power-on-data.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [openPhysicalChannel](open-physical-channel.md) | [common]<br>suspend fun [openPhysicalChannel](open-physical-channel.md)() |
| [release](release.md) | [common]<br>fun [release](release.md)() |
| [setScanMessage](set-scan-message.md) | [common]<br>fun [setScanMessage](set-scan-message.md)(msg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [startCardDetection](start-card-detection.md) | [common]<br>suspend fun [startCardDetection](start-card-detection.md)(onCardFound: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) |
| [transmitApdu](transmit-apdu.md) | [common]<br>suspend fun [transmitApdu](transmit-apdu.md)(commandApdu: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [waitForCardPresent](wait-for-card-present.md) | [common]<br>suspend fun [waitForCardPresent](wait-for-card-present.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
