package org.sisioh.aws4s.s3.model

import java.security.Provider

import com.amazonaws.regions.Regions
import com.amazonaws.services.s3.model.{CryptoConfiguration, CryptoMode, CryptoStorageMode}
import org.sisioh.aws4s.PimpedType

object CryptoConfigurationFactory {

  def create(): CryptoConfiguration = new CryptoConfiguration()

  def create(cryptoMode: CryptoMode): CryptoConfiguration = new CryptoConfiguration(cryptoMode)

}

class RichCryptoConfiguration(val underlying: CryptoConfiguration)
  extends AnyVal with PimpedType[CryptoConfiguration] {

  def cryptoModeOpt: Option[CryptoMode] = Option(underlying.getCryptoMode)

  def cryptoModeOpt_=(value: Option[CryptoMode]): Unit =
    underlying.setCryptoMode(value.orNull)

  def withCryptoModeOpt(value: Option[CryptoMode]): CryptoConfiguration =
    underlying.withCryptoMode(value.orNull)

  // ---

  def storageModeOpt: Option[CryptoStorageMode] = Option(underlying.getStorageMode)

  def storageModeOpt_=(value: Option[CryptoStorageMode]): Unit =
    underlying.setStorageMode(value.orNull)

  def withStorageModeOpt(value: Option[CryptoStorageMode]): CryptoConfiguration =
    underlying.withStorageMode(value.orNull)

  // ---

  def cryptoProviderOpt: Option[Provider] = Option(underlying.getCryptoProvider)

  def cryptoProviderOpt_=(value: Option[Provider]): Unit =
    underlying.setCryptoProvider(value.orNull)

  def withCryptoProviderOpt(value: Option[Provider]): CryptoConfiguration =
    underlying.withCryptoProvider(value.orNull)

  // ---

  def ignoreMissingInstructionFile: Boolean = underlying.isIgnoreMissingInstructionFile

  def ignoreMissingInstructionFile_=(value: Boolean): Unit =
    underlying.setIgnoreMissingInstructionFile(value)

  def withIgnoreMissingInstructionFile(value: Boolean): CryptoConfiguration =
    underlying.withIgnoreMissingInstructionFile(value)

  // ---

  def kmsRegion: Regions = underlying.getKmsRegion

  def kmsRegion_=(value: Regions): Unit =
    underlying.setKmsRegion(value)

}
