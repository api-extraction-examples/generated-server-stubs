import unittest

from flask import json

from openapi_server.models.device_profile import DeviceProfile  # noqa: E501
from openapi_server.models.device_profile_info import DeviceProfileInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDlnaController(BaseTestCase):
    """DlnaController integration test stubs"""

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_create_profile(self):
        """Test case for create_profile

        Creates a profile.
        """
        device_profile = {"EnableSingleAlbumArtLimit":True,"ManufacturerUrl":"ManufacturerUrl","MusicStreamingTranscodingBitrate":9,"AlbumArtPn":"AlbumArtPn","TranscodingProfiles":[{"BreakOnNonKeyFrames":True,"EnableSubtitlesInManifest":True,"CopyTimestamps":True,"MinSegments":2,"EnableMpegtsM2TsMode":True,"MaxAudioChannels":"MaxAudioChannels","VideoCodec":"VideoCodec","Container":"Container","EstimateContentLength":True,"SegmentLength":4,"Protocol":"Protocol","AudioCodec":"AudioCodec"},{"BreakOnNonKeyFrames":True,"EnableSubtitlesInManifest":True,"CopyTimestamps":True,"MinSegments":2,"EnableMpegtsM2TsMode":True,"MaxAudioChannels":"MaxAudioChannels","VideoCodec":"VideoCodec","Container":"Container","EstimateContentLength":True,"SegmentLength":4,"Protocol":"Protocol","AudioCodec":"AudioCodec"}],"Identification":{"ManufacturerUrl":"ManufacturerUrl","ModelNumber":"ModelNumber","ModelUrl":"ModelUrl","ModelName":"ModelName","SerialNumber":"SerialNumber","FriendlyName":"FriendlyName","Headers":[{"Value":"Value","Name":"Name"},{"Value":"Value","Name":"Name"}],"Manufacturer":"Manufacturer","ModelDescription":"ModelDescription"},"MaxStreamingBitrate":7,"IgnoreTranscodeByteRangeRequests":True,"Name":"Name","ResponseProfiles":[{"Container":"Container","OrgPn":"OrgPn","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"MimeType":"MimeType"},{"Container":"Container","OrgPn":"OrgPn","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"MimeType":"MimeType"}],"ModelUrl":"ModelUrl","MaxStaticBitrate":5,"Manufacturer":"Manufacturer","ProtocolInfo":"ProtocolInfo","RequiresPlainVideoItems":True,"ModelDescription":"ModelDescription","MaxAlbumArtWidth":6,"ModelNumber":"ModelNumber","XmlRootAttributes":[{"Value":"Value","Name":"Name"},{"Value":"Value","Name":"Name"}],"ModelName":"ModelName","FriendlyName":"FriendlyName","MaxIconHeight":1,"RequiresPlainFolders":True,"EnableSingleSubtitleLimit":True,"SubtitleProfiles":[{"Container":"Container","Format":"Format","Language":"Language","DidlMode":"DidlMode"},{"Container":"Container","Format":"Format","Language":"Language","DidlMode":"DidlMode"}],"MaxAlbumArtHeight":0,"EnableAlbumArtInDidl":True,"EnableMSMediaReceiverRegistrar":True,"CodecProfiles":[{"Codec":"Codec","Container":"Container","ApplyConditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]},{"Codec":"Codec","Container":"Container","ApplyConditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]}],"SerialNumber":"SerialNumber","SupportedMediaTypes":"SupportedMediaTypes","SonyAggregationFlags":"SonyAggregationFlags","MaxIconWidth":5,"UserId":"UserId","TimelineOffsetSeconds":3,"ContainerProfiles":[{"Container":"Container","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]},{"Container":"Container","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]}],"DirectPlayProfiles":[{"Container":"Container","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec"},{"Container":"Container","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec"}],"MaxStaticMusicBitrate":2,"Id":"Id"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Dlna/Profiles',
            method='POST',
            headers=headers,
            data=json.dumps(device_profile),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_profile(self):
        """Test case for delete_profile

        Deletes a profile.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Dlna/Profiles/{profile_id}'.format(profile_id='profile_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_default_profile(self):
        """Test case for get_default_profile

        Gets the default profile.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Dlna/Profiles/Default',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_profile(self):
        """Test case for get_profile

        Gets a single profile.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Dlna/Profiles/{profile_id}'.format(profile_id='profile_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_profile_infos(self):
        """Test case for get_profile_infos

        Get profile infos.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Dlna/ProfileInfos',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_profile(self):
        """Test case for update_profile

        Updates a profile.
        """
        device_profile = {"EnableSingleAlbumArtLimit":True,"ManufacturerUrl":"ManufacturerUrl","MusicStreamingTranscodingBitrate":9,"AlbumArtPn":"AlbumArtPn","TranscodingProfiles":[{"BreakOnNonKeyFrames":True,"EnableSubtitlesInManifest":True,"CopyTimestamps":True,"MinSegments":2,"EnableMpegtsM2TsMode":True,"MaxAudioChannels":"MaxAudioChannels","VideoCodec":"VideoCodec","Container":"Container","EstimateContentLength":True,"SegmentLength":4,"Protocol":"Protocol","AudioCodec":"AudioCodec"},{"BreakOnNonKeyFrames":True,"EnableSubtitlesInManifest":True,"CopyTimestamps":True,"MinSegments":2,"EnableMpegtsM2TsMode":True,"MaxAudioChannels":"MaxAudioChannels","VideoCodec":"VideoCodec","Container":"Container","EstimateContentLength":True,"SegmentLength":4,"Protocol":"Protocol","AudioCodec":"AudioCodec"}],"Identification":{"ManufacturerUrl":"ManufacturerUrl","ModelNumber":"ModelNumber","ModelUrl":"ModelUrl","ModelName":"ModelName","SerialNumber":"SerialNumber","FriendlyName":"FriendlyName","Headers":[{"Value":"Value","Name":"Name"},{"Value":"Value","Name":"Name"}],"Manufacturer":"Manufacturer","ModelDescription":"ModelDescription"},"MaxStreamingBitrate":7,"IgnoreTranscodeByteRangeRequests":True,"Name":"Name","ResponseProfiles":[{"Container":"Container","OrgPn":"OrgPn","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"MimeType":"MimeType"},{"Container":"Container","OrgPn":"OrgPn","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"MimeType":"MimeType"}],"ModelUrl":"ModelUrl","MaxStaticBitrate":5,"Manufacturer":"Manufacturer","ProtocolInfo":"ProtocolInfo","RequiresPlainVideoItems":True,"ModelDescription":"ModelDescription","MaxAlbumArtWidth":6,"ModelNumber":"ModelNumber","XmlRootAttributes":[{"Value":"Value","Name":"Name"},{"Value":"Value","Name":"Name"}],"ModelName":"ModelName","FriendlyName":"FriendlyName","MaxIconHeight":1,"RequiresPlainFolders":True,"EnableSingleSubtitleLimit":True,"SubtitleProfiles":[{"Container":"Container","Format":"Format","Language":"Language","DidlMode":"DidlMode"},{"Container":"Container","Format":"Format","Language":"Language","DidlMode":"DidlMode"}],"MaxAlbumArtHeight":0,"EnableAlbumArtInDidl":True,"EnableMSMediaReceiverRegistrar":True,"CodecProfiles":[{"Codec":"Codec","Container":"Container","ApplyConditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]},{"Codec":"Codec","Container":"Container","ApplyConditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]}],"SerialNumber":"SerialNumber","SupportedMediaTypes":"SupportedMediaTypes","SonyAggregationFlags":"SonyAggregationFlags","MaxIconWidth":5,"UserId":"UserId","TimelineOffsetSeconds":3,"ContainerProfiles":[{"Container":"Container","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]},{"Container":"Container","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]}],"DirectPlayProfiles":[{"Container":"Container","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec"},{"Container":"Container","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec"}],"MaxStaticMusicBitrate":2,"Id":"Id"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Dlna/Profiles/{profile_id}'.format(profile_id='profile_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(device_profile),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
