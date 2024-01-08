import unittest

from flask import json

from openapi_server.models.music_export_error_response import MusicExportErrorResponse  # noqa: E501
from openapi_server.models.music_export_job import MusicExportJob  # noqa: E501
from openapi_server.models.music_export_preferences import MusicExportPreferences  # noqa: E501
from openapi_server.models.music_export_preferences_response import MusicExportPreferencesResponse  # noqa: E501
from openapi_server.models.music_export_success import MusicExportSuccess  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMusicExportController(BaseTestCase):
    """MusicExportController integration test stubs"""

    def test_delete_music_preferences_export(self):
        """Test case for delete_music_preferences_export

        Music Export Preferences
        """
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/preferences/export',
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_music_preferences_export_vendor(self):
        """Test case for delete_music_preferences_export_vendor

        Music Export Vendor Preferences
        """
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/preferences/export/{vendor}'.format(vendor='vendor_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_export(self):
        """Test case for get_music_export

        Music Exports
        """
        query_string = [('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/export',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_export_jobs(self):
        """Test case for get_music_export_jobs

        Music Export Jobs
        """
        query_string = [('over16', True),
                        ('vendor', 'vendor_example')]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/exports/jobs',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_export_tracks(self):
        """Test case for get_music_export_tracks

        Music Export Tracks
        """
        query_string = [('over16', True),
                        ('offset', 56),
                        ('limit', 56),
                        ('vendor', 'vendor_example'),
                        ('status', 'status_example')]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/exports/tracks',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_preferences_export(self):
        """Test case for get_music_preferences_export

        Music Export Preferences
        """
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/preferences/export',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_preferences_export_vendor(self):
        """Test case for get_music_preferences_export_vendor

        Music Export Vendor Preferences
        """
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/preferences/export/{vendor}'.format(vendor='vendor_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_music_export_job(self):
        """Test case for post_music_export_job

        Music Export Jobs
        """
        body = {"job_id":"job_id","vendor":"vendor","created_at":"created_at","id":"id","status":"status"}
        query_string = [('over16', True),
                        ('vendor', 'vendor_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/exports/jobs',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_music_preferences_export(self):
        """Test case for post_music_preferences_export

        Music Export Preferences
        """
        body = {"access_token":"access_token","refresh_token":"refresh_token","last_export":"last_export","partner_id":"partner_id","terms":True,"authorization_code":"authorization_code","vendor":"vendor","add_plus_export":True,"access_expires_at":"access_expires_at","legacy_state":"legacy_state"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/preferences/export',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_music_preferences_export_vendor(self):
        """Test case for post_music_preferences_export_vendor

        Music Export Vendor Preferences
        """
        body = {"access_token":"access_token","refresh_token":"refresh_token","last_export":"last_export","partner_id":"partner_id","terms":True,"authorization_code":"authorization_code","vendor":"vendor","add_plus_export":True,"access_expires_at":"access_expires_at","legacy_state":"legacy_state"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/preferences/export/{vendor}'.format(vendor='vendor_example'),
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_music_preferences_export_vendor(self):
        """Test case for put_music_preferences_export_vendor

        Music Export Vendor Preferences
        """
        body = {"access_token":"access_token","refresh_token":"refresh_token","last_export":"last_export","partner_id":"partner_id","terms":True,"authorization_code":"authorization_code","vendor":"vendor","add_plus_export":True,"access_expires_at":"access_expires_at","legacy_state":"legacy_state"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/preferences/export/{vendor}'.format(vendor='vendor_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
