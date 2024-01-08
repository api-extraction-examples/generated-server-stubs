import unittest

from flask import json

from openapi_server.models.startup_configuration_dto import StartupConfigurationDto  # noqa: E501
from openapi_server.models.startup_remote_access_dto import StartupRemoteAccessDto  # noqa: E501
from openapi_server.models.startup_user_dto import StartupUserDto  # noqa: E501
from openapi_server.test import BaseTestCase


class TestStartupController(BaseTestCase):
    """StartupController integration test stubs"""

    def test_complete_wizard(self):
        """Test case for complete_wizard

        Completes the startup wizard.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Startup/Complete',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_first_user(self):
        """Test case for get_first_user

        Gets the first user.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Startup/User',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_first_user2(self):
        """Test case for get_first_user2

        Gets the first user.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Startup/FirstUser',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_startup_configuration(self):
        """Test case for get_startup_configuration

        Gets the initial startup wizard configuration.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Startup/Configuration',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_set_remote_access(self):
        """Test case for set_remote_access

        Sets remote access and UPnP.
        """
        startup_remote_access_dto = {"EnableAutomaticPortMapping":True,"EnableRemoteAccess":True}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Startup/RemoteAccess',
            method='POST',
            headers=headers,
            data=json.dumps(startup_remote_access_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_initial_configuration(self):
        """Test case for update_initial_configuration

        Sets the initial startup wizard configuration.
        """
        startup_configuration_dto = {"PreferredMetadataLanguage":"PreferredMetadataLanguage","UICulture":"UICulture","MetadataCountryCode":"MetadataCountryCode"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Startup/Configuration',
            method='POST',
            headers=headers,
            data=json.dumps(startup_configuration_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_startup_user(self):
        """Test case for update_startup_user

        Sets the user name and password.
        """
        startup_user_dto = {"Name":"Name","Password":"Password"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Startup/User',
            method='POST',
            headers=headers,
            data=json.dumps(startup_user_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
