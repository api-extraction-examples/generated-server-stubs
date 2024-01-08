import unittest

from flask import json

from openapi_server.models.live_stream_response import LiveStreamResponse  # noqa: E501
from openapi_server.models.open_live_stream_dto import OpenLiveStreamDto  # noqa: E501
from openapi_server.models.playback_info_dto import PlaybackInfoDto  # noqa: E501
from openapi_server.models.playback_info_response import PlaybackInfoResponse  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMediaInfoController(BaseTestCase):
    """MediaInfoController integration test stubs"""

    def test_close_live_stream(self):
        """Test case for close_live_stream

        Closes a media source.
        """
        query_string = [('liveStreamId', 'live_stream_id_example')]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/LiveStreams/Close',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_bitrate_test_bytes(self):
        """Test case for get_bitrate_test_bytes

        Tests the network with a request with the size of the bitrate.
        """
        query_string = [('size', 102400)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Playback/BitrateTest',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_playback_info(self):
        """Test case for get_playback_info

        Gets live playback media info for an item.
        """
        query_string = [('userId', 'user_id_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/PlaybackInfo'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_get_posted_playback_info(self):
        """Test case for get_posted_playback_info

        Gets live playback media info for an item.
        """
        playback_info_dto = {"AutoOpenLiveStream":True,"EnableDirectStream":True,"MediaSourceId":"MediaSourceId","MaxAudioChannels":6,"SubtitleStreamIndex":5,"MaxStreamingBitrate":1,"AllowVideoStreamCopy":True,"StartTimeTicks":5,"DeviceProfile":{"EnableSingleAlbumArtLimit":True,"ManufacturerUrl":"ManufacturerUrl","MusicStreamingTranscodingBitrate":9,"AlbumArtPn":"AlbumArtPn","TranscodingProfiles":[{"BreakOnNonKeyFrames":True,"EnableSubtitlesInManifest":True,"CopyTimestamps":True,"MinSegments":2,"EnableMpegtsM2TsMode":True,"MaxAudioChannels":"MaxAudioChannels","VideoCodec":"VideoCodec","Container":"Container","EstimateContentLength":True,"SegmentLength":4,"Protocol":"Protocol","AudioCodec":"AudioCodec"},{"BreakOnNonKeyFrames":True,"EnableSubtitlesInManifest":True,"CopyTimestamps":True,"MinSegments":2,"EnableMpegtsM2TsMode":True,"MaxAudioChannels":"MaxAudioChannels","VideoCodec":"VideoCodec","Container":"Container","EstimateContentLength":True,"SegmentLength":4,"Protocol":"Protocol","AudioCodec":"AudioCodec"}],"Identification":{"ManufacturerUrl":"ManufacturerUrl","ModelNumber":"ModelNumber","ModelUrl":"ModelUrl","ModelName":"ModelName","SerialNumber":"SerialNumber","FriendlyName":"FriendlyName","Headers":[{"Value":"Value","Name":"Name"},{"Value":"Value","Name":"Name"}],"Manufacturer":"Manufacturer","ModelDescription":"ModelDescription"},"MaxStreamingBitrate":7,"IgnoreTranscodeByteRangeRequests":True,"Name":"Name","ResponseProfiles":[{"Container":"Container","OrgPn":"OrgPn","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"MimeType":"MimeType"},{"Container":"Container","OrgPn":"OrgPn","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"MimeType":"MimeType"}],"ModelUrl":"ModelUrl","MaxStaticBitrate":5,"Manufacturer":"Manufacturer","ProtocolInfo":"ProtocolInfo","RequiresPlainVideoItems":True,"ModelDescription":"ModelDescription","MaxAlbumArtWidth":6,"ModelNumber":"ModelNumber","XmlRootAttributes":[{"Value":"Value","Name":"Name"},{"Value":"Value","Name":"Name"}],"ModelName":"ModelName","FriendlyName":"FriendlyName","MaxIconHeight":1,"RequiresPlainFolders":True,"EnableSingleSubtitleLimit":True,"SubtitleProfiles":[{"Container":"Container","Format":"Format","Language":"Language","DidlMode":"DidlMode"},{"Container":"Container","Format":"Format","Language":"Language","DidlMode":"DidlMode"}],"MaxAlbumArtHeight":0,"EnableAlbumArtInDidl":True,"EnableMSMediaReceiverRegistrar":True,"CodecProfiles":[{"Codec":"Codec","Container":"Container","ApplyConditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]},{"Codec":"Codec","Container":"Container","ApplyConditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]}],"SerialNumber":"SerialNumber","SupportedMediaTypes":"SupportedMediaTypes","SonyAggregationFlags":"SonyAggregationFlags","MaxIconWidth":5,"UserId":"UserId","TimelineOffsetSeconds":3,"ContainerProfiles":[{"Container":"Container","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]},{"Container":"Container","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]}],"DirectPlayProfiles":[{"Container":"Container","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec"},{"Container":"Container","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec"}],"MaxStaticMusicBitrate":2,"Id":"Id"},"AudioStreamIndex":0,"UserId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","AllowAudioStreamCopy":True,"LiveStreamId":"LiveStreamId","EnableTranscoding":True,"EnableDirectPlay":True}
        query_string = [('userId', 'user_id_example'),
                        ('maxStreamingBitrate', 56),
                        ('startTimeTicks', 56),
                        ('audioStreamIndex', 56),
                        ('subtitleStreamIndex', 56),
                        ('maxAudioChannels', 56),
                        ('mediaSourceId', 'media_source_id_example'),
                        ('liveStreamId', 'live_stream_id_example'),
                        ('autoOpenLiveStream', True),
                        ('enableDirectPlay', True),
                        ('enableDirectStream', True),
                        ('enableTranscoding', True),
                        ('allowVideoStreamCopy', True),
                        ('allowAudioStreamCopy', True)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/PlaybackInfo'.format(item_id='item_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(playback_info_dto),
            content_type='application/*+json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_open_live_stream(self):
        """Test case for open_live_stream

        Opens a media source.
        """
        open_live_stream_dto = {"DirectPlayProtocols":[null,null],"EnableDirectStream":True,"MaxAudioChannels":6,"SubtitleStreamIndex":5,"ItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","MaxStreamingBitrate":1,"OpenToken":"OpenToken","StartTimeTicks":5,"DeviceProfile":{"EnableSingleAlbumArtLimit":True,"ManufacturerUrl":"ManufacturerUrl","MusicStreamingTranscodingBitrate":9,"AlbumArtPn":"AlbumArtPn","TranscodingProfiles":[{"BreakOnNonKeyFrames":True,"EnableSubtitlesInManifest":True,"CopyTimestamps":True,"MinSegments":2,"EnableMpegtsM2TsMode":True,"MaxAudioChannels":"MaxAudioChannels","VideoCodec":"VideoCodec","Container":"Container","EstimateContentLength":True,"SegmentLength":4,"Protocol":"Protocol","AudioCodec":"AudioCodec"},{"BreakOnNonKeyFrames":True,"EnableSubtitlesInManifest":True,"CopyTimestamps":True,"MinSegments":2,"EnableMpegtsM2TsMode":True,"MaxAudioChannels":"MaxAudioChannels","VideoCodec":"VideoCodec","Container":"Container","EstimateContentLength":True,"SegmentLength":4,"Protocol":"Protocol","AudioCodec":"AudioCodec"}],"Identification":{"ManufacturerUrl":"ManufacturerUrl","ModelNumber":"ModelNumber","ModelUrl":"ModelUrl","ModelName":"ModelName","SerialNumber":"SerialNumber","FriendlyName":"FriendlyName","Headers":[{"Value":"Value","Name":"Name"},{"Value":"Value","Name":"Name"}],"Manufacturer":"Manufacturer","ModelDescription":"ModelDescription"},"MaxStreamingBitrate":7,"IgnoreTranscodeByteRangeRequests":True,"Name":"Name","ResponseProfiles":[{"Container":"Container","OrgPn":"OrgPn","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"MimeType":"MimeType"},{"Container":"Container","OrgPn":"OrgPn","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"MimeType":"MimeType"}],"ModelUrl":"ModelUrl","MaxStaticBitrate":5,"Manufacturer":"Manufacturer","ProtocolInfo":"ProtocolInfo","RequiresPlainVideoItems":True,"ModelDescription":"ModelDescription","MaxAlbumArtWidth":6,"ModelNumber":"ModelNumber","XmlRootAttributes":[{"Value":"Value","Name":"Name"},{"Value":"Value","Name":"Name"}],"ModelName":"ModelName","FriendlyName":"FriendlyName","MaxIconHeight":1,"RequiresPlainFolders":True,"EnableSingleSubtitleLimit":True,"SubtitleProfiles":[{"Container":"Container","Format":"Format","Language":"Language","DidlMode":"DidlMode"},{"Container":"Container","Format":"Format","Language":"Language","DidlMode":"DidlMode"}],"MaxAlbumArtHeight":0,"EnableAlbumArtInDidl":True,"EnableMSMediaReceiverRegistrar":True,"CodecProfiles":[{"Codec":"Codec","Container":"Container","ApplyConditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]},{"Codec":"Codec","Container":"Container","ApplyConditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]}],"SerialNumber":"SerialNumber","SupportedMediaTypes":"SupportedMediaTypes","SonyAggregationFlags":"SonyAggregationFlags","MaxIconWidth":5,"UserId":"UserId","TimelineOffsetSeconds":3,"ContainerProfiles":[{"Container":"Container","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]},{"Container":"Container","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]}],"DirectPlayProfiles":[{"Container":"Container","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec"},{"Container":"Container","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec"}],"MaxStaticMusicBitrate":2,"Id":"Id"},"PlaySessionId":"PlaySessionId","AudioStreamIndex":0,"UserId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","EnableDirectPlay":True}
        query_string = [('openToken', 'open_token_example'),
                        ('userId', 'user_id_example'),
                        ('playSessionId', 'play_session_id_example'),
                        ('maxStreamingBitrate', 56),
                        ('startTimeTicks', 56),
                        ('audioStreamIndex', 56),
                        ('subtitleStreamIndex', 56),
                        ('maxAudioChannels', 56),
                        ('itemId', 'item_id_example'),
                        ('enableDirectPlay', True),
                        ('enableDirectStream', True)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/LiveStreams/Open',
            method='POST',
            headers=headers,
            data=json.dumps(open_live_stream_dto),
            content_type='application/*+json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
