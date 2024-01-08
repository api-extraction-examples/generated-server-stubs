import unittest

from flask import json

from openapi_server.models.display_preferences_dto import DisplayPreferencesDto  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDisplayPreferencesController(BaseTestCase):
    """DisplayPreferencesController integration test stubs"""

    def test_get_display_preferences(self):
        """Test case for get_display_preferences

        Get Display Preferences.
        """
        query_string = [('userId', 'user_id_example'),
                        ('client', 'client_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/DisplayPreferences/{display_preferences_id}'.format(display_preferences_id='display_preferences_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_display_preferences(self):
        """Test case for update_display_preferences

        Update Display Preferences.
        """
        display_preferences_dto = {"RememberSorting":True,"RememberIndexing":True,"PrimaryImageWidth":6,"IndexBy":"IndexBy","ShowBackdrop":True,"SortBy":"SortBy","ShowSidebar":True,"PrimaryImageHeight":0,"Id":"Id","Client":"Client","CustomPrefs":{"key":"CustomPrefs"},"ViewType":"ViewType"}
        query_string = [('userId', 'user_id_example'),
                        ('client', 'client_example')]
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/DisplayPreferences/{display_preferences_id}'.format(display_preferences_id='display_preferences_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(display_preferences_dto),
            content_type='application/*+json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
