//[keyple-less-reader-nfcmobile-kmp-lib](../../../index.md)/[org.eclipse.keyple.keypleless.reader.nfcmobile](../index.md)/[LocalNfcReader](index.md)/[closePhysicalChannel](close-physical-channel.md)

# closePhysicalChannel

[common, android, jvm]\
[common]\
expect fun [closePhysicalChannel](close-physical-channel.md)()

[android, jvm]\
actual fun [closePhysicalChannel](close-physical-channel.md)()

Attempts to close the current physical channel. The physical channel may have been implicitly closed previously by a card withdrawal.

<exception cref="ReaderNotFoundException">If the communication with the reader has failed.</exception>
