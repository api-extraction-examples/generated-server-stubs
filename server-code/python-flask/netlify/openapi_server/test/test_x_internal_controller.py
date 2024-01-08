import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.plugin import Plugin  # noqa: E501
from openapi_server.models.plugin_params import PluginParams  # noqa: E501
from openapi_server.models.plugin_run import PluginRun  # noqa: E501
from openapi_server.models.plugin_run_data import PluginRunData  # noqa: E501
from openapi_server.test import BaseTestCase


class TestXInternalController(BaseTestCase):
    """XInternalController integration test stubs"""

    def test_create_plugin_run(self):
        """Test case for create_plugin_run

        
        """
        plugin_run = openapi_server.PluginRunData()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/deploys/{deploy_id}/plugin_runs'.format(deploy_id='deploy_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(plugin_run),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_latest_plugin_runs(self):
        """Test case for get_latest_plugin_runs

        
        """
        query_string = [('packages', ['packages_example']),
                        ('state', 'state_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/plugin_runs/latest'.format(site_id='site_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_plugin(self):
        """Test case for update_plugin

        
        """
        plugin_params = openapi_server.PluginParams()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/plugins/{package}'.format(site_id='site_id_example', package='package_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(plugin_params),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
