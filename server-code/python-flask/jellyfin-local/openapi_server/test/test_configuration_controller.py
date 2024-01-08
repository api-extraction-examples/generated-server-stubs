import unittest

from flask import json

from openapi_server.models.media_encoder_path_dto import MediaEncoderPathDto  # noqa: E501
from openapi_server.models.metadata_options import MetadataOptions  # noqa: E501
from openapi_server.models.server_configuration import ServerConfiguration  # noqa: E501
from openapi_server.test import BaseTestCase


class TestConfigurationController(BaseTestCase):
    """ConfigurationController integration test stubs"""

    def test_get_configuration(self):
        """Test case for get_configuration

        Gets application configuration.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/Configuration',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_default_metadata_options(self):
        """Test case for get_default_metadata_options

        Gets a default MetadataOptions object.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/Configuration/MetadataOptions/Default',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_named_configuration(self):
        """Test case for get_named_configuration

        Gets a named configuration.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/Configuration/{key}'.format(key='key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_configuration(self):
        """Test case for update_configuration

        Updates application configuration.
        """
        server_configuration = {"EnableSlowResponseWarning":True,"RemoteIPFilter":["RemoteIPFilter","RemoteIPFilter"],"CorsHosts":["CorsHosts","CorsHosts"],"IsPortAuthorized":True,"IsStartupWizardCompleted":True,"UICulture":"UICulture","CodecsUsed":["CodecsUsed","CodecsUsed"],"AutoDiscovery":True,"LocalNetworkAddresses":["LocalNetworkAddresses","LocalNetworkAddresses"],"EnableUPnP":True,"EnableMultiSocketBinding":True,"EnableIPV4":True,"MetadataCountryCode":"MetadataCountryCode","SaveMetadataHidden":True,"EnableIPV6":True,"EnableNormalizedItemByNameIds":True,"UDPSendDelay":5,"LocalNetworkSubnets":["LocalNetworkSubnets","LocalNetworkSubnets"],"MetadataNetworkPath":"MetadataNetworkPath","EnableNewOmdbSupport":True,"ActivityLogRetentionDays":0,"PublishedServerUriBySubnet":["PublishedServerUriBySubnet","PublishedServerUriBySubnet"],"SortRemoveCharacters":["SortRemoveCharacters","SortRemoveCharacters"],"DisableLiveTvChannelUserDataName":True,"MaxResumePct":4,"HttpServerPortNumber":1,"MinResumeDurationSeconds":1,"SlowResponseThresholdMs":1,"RequireHttps":True,"LogFileRetentionDays":3,"LibraryScanFanoutConcurrency":9,"HDHomerunPortRange":"HDHomerunPortRange","SkipDeserializationForBasicTypes":True,"MetadataOptions":[{"DisabledImageFetchers":["DisabledImageFetchers","DisabledImageFetchers"],"DisabledMetadataSavers":["DisabledMetadataSavers","DisabledMetadataSavers"],"MetadataFetcherOrder":["MetadataFetcherOrder","MetadataFetcherOrder"],"ItemType":"ItemType","DisabledMetadataFetchers":["DisabledMetadataFetchers","DisabledMetadataFetchers"],"ImageFetcherOrder":["ImageFetcherOrder","ImageFetcherOrder"],"LocalMetadataReaderOrder":["LocalMetadataReaderOrder","LocalMetadataReaderOrder"]},{"DisabledImageFetchers":["DisabledImageFetchers","DisabledImageFetchers"],"DisabledMetadataSavers":["DisabledMetadataSavers","DisabledMetadataSavers"],"MetadataFetcherOrder":["MetadataFetcherOrder","MetadataFetcherOrder"],"ItemType":"ItemType","DisabledMetadataFetchers":["DisabledMetadataFetchers","DisabledMetadataFetchers"],"ImageFetcherOrder":["ImageFetcherOrder","ImageFetcherOrder"],"LocalMetadataReaderOrder":["LocalMetadataReaderOrder","LocalMetadataReaderOrder"]}],"HttpsPortNumber":5,"MinResumePct":1,"CertificatePassword":"CertificatePassword","SSDPTracingFilter":"SSDPTracingFilter","RemoteClientBitrateLimit":7,"ImageExtractionTimeoutMs":5,"EnableExternalContentInSuggestions":True,"RemoveOldPlugins":True,"UPnPCreateHttpPortMap":True,"LibraryMonitorDelay":7,"EnableCaseSensitiveItemIds":True,"SortReplaceCharacters":["SortReplaceCharacters","SortReplaceCharacters"],"LibraryMetadataRefreshConcurrency":2,"UDPPortRange":"UDPPortRange","PreviousVersionStr":"PreviousVersionStr","EnableSSDPTracing":True,"AutoDiscoveryTracing":True,"PathSubstitutions":[{"From":"From","To":"To"},{"From":"From","To":"To"}],"CachePath":"CachePath","MaxAudiobookResume":2,"EnableFolderView":True,"BaseUrl":"BaseUrl","UninstalledPlugins":["UninstalledPlugins","UninstalledPlugins"],"DisplaySpecialsWithinSeasons":True,"EnableDashboardResponseCaching":True,"EnableRemoteAccess":True,"KnownProxies":["KnownProxies","KnownProxies"],"MinAudiobookResume":7,"CertificatePath":"CertificatePath","PluginRepositories":[{"Enabled":True,"Url":"Url","Name":"Name"},{"Enabled":True,"Url":"Url","Name":"Name"}],"IgnoreVirtualInterfaces":True,"ContentTypes":[{"Value":"Value","Name":"Name"},{"Value":"Value","Name":"Name"}],"PreviousVersion":{"Major":6,"Revision":2,"Build":0,"Minor":5,"MinorRevision":5,"MajorRevision":1},"GatewayMonitorPeriod":6,"IsRemoteIPFilterBlacklist":True,"MetadataPath":"MetadataPath","UDPSendCount":4,"EnableMetrics":True,"PreferredMetadataLanguage":"PreferredMetadataLanguage","EnableHttps":True,"PublicHttpsPort":1,"TrustAllIP6Interfaces":True,"ServerName":"ServerName","QuickConnectAvailable":True,"EnableSimpleArtistDetection":True,"SortRemoveWords":["SortRemoveWords","SortRemoveWords"],"VirtualInterfaceNames":"VirtualInterfaceNames","EnableGroupingIntoCollections":True,"DisablePluginImages":True,"PublicPort":6}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/Configuration',
            method='POST',
            headers=headers,
            data=json.dumps(server_configuration),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_media_encoder_path(self):
        """Test case for update_media_encoder_path

        Updates the path to the media encoder.
        """
        media_encoder_path_dto = {"Path":"Path","PathType":"PathType"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/MediaEncoder/Path',
            method='POST',
            headers=headers,
            data=json.dumps(media_encoder_path_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_named_configuration(self):
        """Test case for update_named_configuration

        Updates named configuration.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/Configuration/{key}'.format(key='key_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()