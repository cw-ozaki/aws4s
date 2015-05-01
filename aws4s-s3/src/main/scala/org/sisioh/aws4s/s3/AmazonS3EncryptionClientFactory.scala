package org.sisioh.aws4s.s3

import com.amazonaws.ClientConfiguration
import com.amazonaws.auth.{AWSCredentials, AWSCredentialsProvider}
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.services.kms.AWSKMSClient
import com.amazonaws.services.s3.AmazonS3EncryptionClient
import com.amazonaws.services.s3.model.{CryptoConfiguration, EncryptionMaterials, EncryptionMaterialsProvider}

object AmazonS3EncryptionClientFactory {

  def create(encryptionMaterials: EncryptionMaterials) =
    new AmazonS3EncryptionClient(encryptionMaterials)

  def create(encryptionMaterialsProvider: EncryptionMaterialsProvider) =
    new AmazonS3EncryptionClient(encryptionMaterialsProvider)

  def create(encryptionMaterials: EncryptionMaterials, cryptoConfig: CryptoConfiguration) =
    new AmazonS3EncryptionClient(encryptionMaterials, cryptoConfig)

  def create(encryptionMaterialsProvider: EncryptionMaterialsProvider, cryptoConfig: CryptoConfiguration) =
    new AmazonS3EncryptionClient(encryptionMaterialsProvider, cryptoConfig)

  def create(credentials: AWSCredentials, encryptionMaterials: EncryptionMaterials) =
    new AmazonS3EncryptionClient(credentials, encryptionMaterials)

  def create(credentials: AWSCredentials, encryptionMaterialsProvider: EncryptionMaterialsProvider) =
    new AmazonS3EncryptionClient(credentials, encryptionMaterialsProvider)

  def create(credentialsProvider: AWSCredentialsProvider, encryptionMaterialsProvider: EncryptionMaterialsProvider) =
    new AmazonS3EncryptionClient(credentialsProvider, encryptionMaterialsProvider)

  def create(credentials: AWSCredentials, encryptionMaterials: EncryptionMaterials, cryptoConfig: CryptoConfiguration) =
    new AmazonS3EncryptionClient(credentials, encryptionMaterials, cryptoConfig)

  def create(credentials: AWSCredentials, encryptionMaterialsProvider: EncryptionMaterialsProvider, cryptoConfig: CryptoConfiguration) =
    new AmazonS3EncryptionClient(credentials, encryptionMaterialsProvider, cryptoConfig)

  def create(credentialsProvider: AWSCredentialsProvider, encryptionMaterialsProvider: EncryptionMaterialsProvider, cryptoConfig: CryptoConfiguration) =
    new AmazonS3EncryptionClient(credentialsProvider, encryptionMaterialsProvider, cryptoConfig)

  def create(credentials: AWSCredentials, encryptionMaterials: EncryptionMaterials, clientConfig: ClientConfiguration, cryptoConfig: CryptoConfiguration) =
    new AmazonS3EncryptionClient(credentials, encryptionMaterials, clientConfig, cryptoConfig)

  def create(credentials: AWSCredentials,encryptionMaterialsProvider: EncryptionMaterialsProvider, clientConfig: ClientConfiguration, cryptoConfig: CryptoConfiguration) =
    new AmazonS3EncryptionClient(credentials, encryptionMaterialsProvider, clientConfig, cryptoConfig)

  def create(credentialsProvider: AWSCredentialsProvider, kekMaterialsProvider: EncryptionMaterialsProvider, clientConfig: ClientConfiguration, cryptoConfig: CryptoConfiguration) =
    new AmazonS3EncryptionClient(credentialsProvider, kekMaterialsProvider, clientConfig, cryptoConfig)

  def create(credentialsProvider: AWSCredentialsProvider, kekMaterialsProvider: EncryptionMaterialsProvider, clientConfig: ClientConfiguration, cryptoConfig: CryptoConfiguration, requestMetricCollector: RequestMetricCollector) =
    new AmazonS3EncryptionClient(credentialsProvider, kekMaterialsProvider, clientConfig, cryptoConfig, requestMetricCollector)

  def create(kms: AWSKMSClient, credentialsProvider: AWSCredentialsProvider, kekMaterialsProvider: EncryptionMaterialsProvider, clientConfig: ClientConfiguration, cryptoConfig: CryptoConfiguration, requestMetricCollector: RequestMetricCollector) =
    new AmazonS3EncryptionClient(kms, credentialsProvider, kekMaterialsProvider, clientConfig, cryptoConfig, requestMetricCollector)

}
