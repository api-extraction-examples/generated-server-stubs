import unittest

from flask import json

from openapi_server.models.font_file import FontFile  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.remote_subtitle_info import RemoteSubtitleInfo  # noqa: E501
from openapi_server.models.upload_subtitle_dto import UploadSubtitleDto  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSubtitleController(BaseTestCase):
    """SubtitleController integration test stubs"""

    def test_delete_subtitle(self):
        """Test case for delete_subtitle

        Deletes an external subtitle file.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Videos/{item_id}/Subtitles/{index}'.format(item_id='item_id_example', index=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_download_remote_subtitles(self):
        """Test case for download_remote_subtitles

        Downloads a remote subtitle.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/RemoteSearch/Subtitles/{subtitle_id}'.format(item_id='item_id_example', subtitle_id='subtitle_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fallback_font(self):
        """Test case for get_fallback_font

        Gets a fallback font file.
        """
        headers = { 
            'Accept': 'font/*',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/FallbackFont/Fonts/{name}'.format(name='name_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fallback_font_list(self):
        """Test case for get_fallback_font_list

        Gets a list of available fallback font files.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/FallbackFont/Fonts',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_remote_subtitles(self):
        """Test case for get_remote_subtitles

        Gets the remote subtitles.
        """
        headers = { 
            'Accept': 'text/*',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Providers/Subtitles/Subtitles/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_subtitle(self):
        """Test case for get_subtitle

        Gets subtitles in a specified format.
        """
        query_string = [('endPositionTicks', 56),
                        ('copyTimestamps', False),
                        ('addVttTimeMap', False),
                        ('startPositionTicks', 0)]
        headers = { 
            'Accept': 'text/*',
        }
        response = self.client.open(
            '/Videos/{item_id}/{media_source_id}/Subtitles/{index}/Stream.{format}'.format(item_id='item_id_example', media_source_id='media_source_id_example', index=56, format='format_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_subtitle_playlist(self):
        """Test case for get_subtitle_playlist

        Gets an HLS subtitle playlist.
        """
        query_string = [('segmentLength', 56)]
        headers = { 
            'Accept': 'application/x-mpegURL',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Videos/{item_id}/{media_source_id}/Subtitles/{index}/subtitles.m3u8'.format(item_id='item_id_example', index=56, media_source_id='media_source_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_subtitle_with_ticks(self):
        """Test case for get_subtitle_with_ticks

        Gets subtitles in a specified format.
        """
        query_string = [('endPositionTicks', 56),
                        ('copyTimestamps', False),
                        ('addVttTimeMap', False)]
        headers = { 
            'Accept': 'text/*',
        }
        response = self.client.open(
            '/Videos/{item_id}/{media_source_id}/Subtitles/{index}/{start_position_ticks}/Stream.{format}'.format(item_id='item_id_example', media_source_id='media_source_id_example', index=56, start_position_ticks=56, format='format_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_remote_subtitles(self):
        """Test case for search_remote_subtitles

        Search remote subtitles.
        """
        query_string = [('isPerfectMatch', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/RemoteSearch/Subtitles/{language}'.format(item_id='item_id_example', language='language_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_upload_subtitle(self):
        """Test case for upload_subtitle

        Upload an external subtitle file.
        """
        upload_subtitle_dto = {"Format":"Format","IsForced":True,"Language":"Language","Data":"Data"}
        headers = { 
            'Content-Type': 'application/*+json',
        }
        response = self.client.open(
            '/Videos/{item_id}/Subtitles'.format(item_id='item_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(upload_subtitle_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
