//[keyple-less-reader-nfcmobile-kmp-lib](../../../index.md)/[org.eclipse.keyple.keypleless.reader.nfcmobile](../index.md)/[LocalNfcReader](index.md)

# LocalNfcReader

[common]\
expect class [LocalNfcReader](index.md)

[android, jvm]\
actual class [LocalNfcReader](index.md)

## Constructors

| | |
|---|---|
| [LocalNfcReader](-local-nfc-reader.md) | [android]<br>constructor(activity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html))<br>[jvm]<br>constructor(readerNameFilter: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;*&quot;) |

## Properties

| Name | Summary |
|---|---|
| [readerNameFilter](reader-name-filter.md) | [jvm]<br>val [readerNameFilter](reader-name-filter.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [scanMessage](scan-message.md) | [common, android, jvm]<br>[common]<br>expect var [scanMessage](scan-message.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>[android, jvm]<br>actual var [scanMessage](scan-message.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Functions

| Name | Summary |
|---|---|
| [closePhysicalChannel](close-physical-channel.md) | [common, android, jvm]<br>[common]<br>expect fun [closePhysicalChannel](close-physical-channel.md)()<br>[android, jvm]<br>actual fun [closePhysicalChannel](close-physical-channel.md)()<br>Attempts to close the current physical channel. The physical channel may have been implicitly closed previously by a card withdrawal. |
| [getPowerOnData](get-power-on-data.md) | [common, android, jvm]<br>[common]<br>expect fun [getPowerOnData](get-power-on-data.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>[android, jvm]<br>actual fun [getPowerOnData](get-power-on-data.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Gets the power-on data. The power-on data is defined as the data retrieved by the reader when the card is inserted. |
| [openPhysicalChannel](open-physical-channel.md) | [common, android, jvm]<br>[common]<br>expect fun [openPhysicalChannel](open-physical-channel.md)()<br>[android, jvm]<br>actual fun [openPhysicalChannel](open-physical-channel.md)()<br>Attempts to open the physical channel (to establish communication with the card). <exception cref=&quot;ReaderNotFoundException&quot;>If the communication with the reader has failed.</exception><exception cref="CardIOException">If the communication with the card has failed.</exception> |
| [releaseReader](release-reader.md) | [common, android, jvm]<br>[common]<br>expect fun [releaseReader](release-reader.md)()<br>[android, jvm]<br>actual fun [releaseReader](release-reader.md)() |
| [startCardDetection](start-card-detection.md) | [common, android, jvm]<br>[common]<br>expect suspend fun [startCardDetection](start-card-detection.md)(onCardFound: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>[android, jvm]<br>actual suspend fun [startCardDetection](start-card-detection.md)(onCardFound: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) |
| [transmitApdu](transmit-apdu.md) | [common, android, jvm]<br>[common]<br>expect fun [transmitApdu](transmit-apdu.md)(commandApdu: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>[android, jvm]<br>actual fun [transmitApdu](transmit-apdu.md)(commandApdu: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Transmits an Application Protocol Data Unit (APDU) command to the smart card and receives the response. |
| [waitForCardPresent](wait-for-card-present.md) | [common]<br>expect suspend fun [waitForCardPresent](wait-for-card-present.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Waits for a card to be inserted in the reader<br>[android, jvm]<br>[android, jvm]<br>actual suspend fun [waitForCardPresent](wait-for-card-present.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
