import unittest

from flask import json

from openapi_server.models.client_capabilities_dto import ClientCapabilitiesDto  # noqa: E501
from openapi_server.models.general_command import GeneralCommand  # noqa: E501
from openapi_server.models.general_command_type import GeneralCommandType  # noqa: E501
from openapi_server.models.name_id_pair import NameIdPair  # noqa: E501
from openapi_server.models.play_command import PlayCommand  # noqa: E501
from openapi_server.models.playstate_command import PlaystateCommand  # noqa: E501
from openapi_server.models.session_info import SessionInfo  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSessionController(BaseTestCase):
    """SessionController integration test stubs"""

    def test_add_user_to_session(self):
        """Test case for add_user_to_session

        Adds an additional user to a session.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/{session_id}/User/{user_id}'.format(session_id='session_id_example', user_id='user_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_display_content(self):
        """Test case for display_content

        Instructs a session to browse to an item or view.
        """
        query_string = [('itemType', 'item_type_example'),
                        ('itemId', 'item_id_example'),
                        ('itemName', 'item_name_example')]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/{session_id}/Viewing'.format(session_id='session_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_auth_providers(self):
        """Test case for get_auth_providers

        Get all auth providers.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Auth/Providers',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_password_reset_providers(self):
        """Test case for get_password_reset_providers

        Get all password reset providers.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Auth/PasswordResetProviders',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sessions(self):
        """Test case for get_sessions

        Gets a list of sessions.
        """
        query_string = [('controllableByUserId', 'controllable_by_user_id_example'),
                        ('deviceId', 'device_id_example'),
                        ('activeWithinSeconds', 56)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_play(self):
        """Test case for play

        Instructs a session to play an item.
        """
        query_string = [('playCommand', openapi_server.PlayCommand()),
                        ('itemIds', ['item_ids_example']),
                        ('startPositionTicks', 56)]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/{session_id}/Playing'.format(session_id='session_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_capabilities(self):
        """Test case for post_capabilities

        Updates capabilities for a device.
        """
        query_string = [('id', 'id_example'),
                        ('playableMediaTypes', ['playable_media_types_example']),
                        ('supportedCommands', [openapi_server.GeneralCommandType()]),
                        ('supportsMediaControl', False),
                        ('supportsSync', False),
                        ('supportsPersistentIdentifier', True)]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/Capabilities',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_post_full_capabilities(self):
        """Test case for post_full_capabilities

        Updates capabilities for a device.
        """
        client_capabilities_dto = {"IconUrl":"IconUrl","DeviceProfile":{"EnableSingleAlbumArtLimit":True,"ManufacturerUrl":"ManufacturerUrl","MusicStreamingTranscodingBitrate":9,"AlbumArtPn":"AlbumArtPn","TranscodingProfiles":[{"BreakOnNonKeyFrames":True,"EnableSubtitlesInManifest":True,"CopyTimestamps":True,"MinSegments":2,"EnableMpegtsM2TsMode":True,"MaxAudioChannels":"MaxAudioChannels","VideoCodec":"VideoCodec","Container":"Container","EstimateContentLength":True,"SegmentLength":4,"Protocol":"Protocol","AudioCodec":"AudioCodec"},{"BreakOnNonKeyFrames":True,"EnableSubtitlesInManifest":True,"CopyTimestamps":True,"MinSegments":2,"EnableMpegtsM2TsMode":True,"MaxAudioChannels":"MaxAudioChannels","VideoCodec":"VideoCodec","Container":"Container","EstimateContentLength":True,"SegmentLength":4,"Protocol":"Protocol","AudioCodec":"AudioCodec"}],"Identification":{"ManufacturerUrl":"ManufacturerUrl","ModelNumber":"ModelNumber","ModelUrl":"ModelUrl","ModelName":"ModelName","SerialNumber":"SerialNumber","FriendlyName":"FriendlyName","Headers":[{"Value":"Value","Name":"Name"},{"Value":"Value","Name":"Name"}],"Manufacturer":"Manufacturer","ModelDescription":"ModelDescription"},"MaxStreamingBitrate":7,"IgnoreTranscodeByteRangeRequests":True,"Name":"Name","ResponseProfiles":[{"Container":"Container","OrgPn":"OrgPn","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"MimeType":"MimeType"},{"Container":"Container","OrgPn":"OrgPn","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"MimeType":"MimeType"}],"ModelUrl":"ModelUrl","MaxStaticBitrate":5,"Manufacturer":"Manufacturer","ProtocolInfo":"ProtocolInfo","RequiresPlainVideoItems":True,"ModelDescription":"ModelDescription","MaxAlbumArtWidth":6,"ModelNumber":"ModelNumber","XmlRootAttributes":[{"Value":"Value","Name":"Name"},{"Value":"Value","Name":"Name"}],"ModelName":"ModelName","FriendlyName":"FriendlyName","MaxIconHeight":1,"RequiresPlainFolders":True,"EnableSingleSubtitleLimit":True,"SubtitleProfiles":[{"Container":"Container","Format":"Format","Language":"Language","DidlMode":"DidlMode"},{"Container":"Container","Format":"Format","Language":"Language","DidlMode":"DidlMode"}],"MaxAlbumArtHeight":0,"EnableAlbumArtInDidl":True,"EnableMSMediaReceiverRegistrar":True,"CodecProfiles":[{"Codec":"Codec","Container":"Container","ApplyConditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]},{"Codec":"Codec","Container":"Container","ApplyConditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}],"Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]}],"SerialNumber":"SerialNumber","SupportedMediaTypes":"SupportedMediaTypes","SonyAggregationFlags":"SonyAggregationFlags","MaxIconWidth":5,"UserId":"UserId","TimelineOffsetSeconds":3,"ContainerProfiles":[{"Container":"Container","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]},{"Container":"Container","Conditions":[{"IsRequired":True,"Value":"Value"},{"IsRequired":True,"Value":"Value"}]}],"DirectPlayProfiles":[{"Container":"Container","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec"},{"Container":"Container","VideoCodec":"VideoCodec","AudioCodec":"AudioCodec"}],"MaxStaticMusicBitrate":2,"Id":"Id"},"PlayableMediaTypes":["PlayableMediaTypes","PlayableMediaTypes"],"SupportedCommands":[null,null],"SupportsContentUploading":True,"SupportsMediaControl":True,"SupportsPersistentIdentifier":True,"AppStoreUrl":"AppStoreUrl","SupportsSync":True,"MessageCallbackUrl":"MessageCallbackUrl"}
        query_string = [('id', 'id_example')]
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/Capabilities/Full',
            method='POST',
            headers=headers,
            data=json.dumps(client_capabilities_dto),
            content_type='application/*+json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_user_from_session(self):
        """Test case for remove_user_from_session

        Removes an additional user from a session.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/{session_id}/User/{user_id}'.format(session_id='session_id_example', user_id='user_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_report_session_ended(self):
        """Test case for report_session_ended

        Reports that a session has ended.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/Logout',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_report_viewing(self):
        """Test case for report_viewing

        Reports that a session is viewing an item.
        """
        query_string = [('sessionId', 'session_id_example'),
                        ('itemId', 'item_id_example')]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/Viewing',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_send_full_general_command(self):
        """Test case for send_full_general_command

        Issues a full general command to a client.
        """
        general_command = {"Arguments":{"key":"Arguments"},"ControllingUserId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/{session_id}/Command'.format(session_id='session_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(general_command),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_general_command(self):
        """Test case for send_general_command

        Issues a general command to a client.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/{session_id}/Command/{command}'.format(session_id='session_id_example', command=openapi_server.GeneralCommandType()),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_message_command(self):
        """Test case for send_message_command

        Issues a command to a client to display a message to the user.
        """
        query_string = [('text', 'text_example'),
                        ('header', 'header_example'),
                        ('timeoutMs', 56)]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/{session_id}/Message'.format(session_id='session_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_playstate_command(self):
        """Test case for send_playstate_command

        Issues a playstate command to a client.
        """
        query_string = [('seekPositionTicks', 56),
                        ('controllingUserId', 'controlling_user_id_example')]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/{session_id}/Playing/{command}'.format(session_id='session_id_example', command=openapi_server.PlaystateCommand()),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_system_command(self):
        """Test case for send_system_command

        Issues a system command to a client.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Sessions/{session_id}/System/{command}'.format(session_id='session_id_example', command=openapi_server.GeneralCommandType()),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
