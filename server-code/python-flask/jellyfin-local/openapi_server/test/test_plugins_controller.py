import unittest

from flask import json

from openapi_server.models.plugin_info import PluginInfo  # noqa: E501
from openapi_server.models.plugin_security_info import PluginSecurityInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.version import Version  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPluginsController(BaseTestCase):
    """PluginsController integration test stubs"""

    def test_disable_plugin(self):
        """Test case for disable_plugin

        Disable a plugin.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Plugins/{plugin_id}/{version}/Disable'.format(plugin_id='plugin_id_example', version=openapi_server.Version()),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_enable_plugin(self):
        """Test case for enable_plugin

        Enables a disabled plugin.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Plugins/{plugin_id}/{version}/Enable'.format(plugin_id='plugin_id_example', version=openapi_server.Version()),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_plugin_configuration(self):
        """Test case for get_plugin_configuration

        Gets plugin configuration.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Plugins/{plugin_id}/Configuration'.format(plugin_id='plugin_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_plugin_image(self):
        """Test case for get_plugin_image

        Gets a plugin's image.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Plugins/{plugin_id}/{version}/Image'.format(plugin_id='plugin_id_example', version=openapi_server.Version()),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_plugin_manifest(self):
        """Test case for get_plugin_manifest

        Gets a plugin's manifest.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Plugins/{plugin_id}/Manifest'.format(plugin_id='plugin_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_plugins(self):
        """Test case for get_plugins

        Gets a list of currently installed plugins.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Plugins',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_uninstall_plugin(self):
        """Test case for uninstall_plugin

        Uninstalls a plugin.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Plugins/{plugin_id}'.format(plugin_id='plugin_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_uninstall_plugin_by_version(self):
        """Test case for uninstall_plugin_by_version

        Uninstalls a plugin by version.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Plugins/{plugin_id}/{version}'.format(plugin_id='plugin_id_example', version=openapi_server.Version()),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_plugin_configuration(self):
        """Test case for update_plugin_configuration

        Updates plugin configuration.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Plugins/{plugin_id}/Configuration'.format(plugin_id='plugin_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_plugin_security_info(self):
        """Test case for update_plugin_security_info

        Updates plugin security info.
        """
        plugin_security_info = {"IsMbSupporter":True,"SupporterKey":"SupporterKey"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Plugins/SecurityInfo',
            method='POST',
            headers=headers,
            data=json.dumps(plugin_security_info),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
