import unittest

from flask import json

from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_relay_auto_config_request import PostRelayAutoConfigRequest  # noqa: E501
from openapi_server.models.relay_proxy_config import RelayProxyConfig  # noqa: E501
from openapi_server.models.relay_proxy_configs import RelayProxyConfigs  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRelayProxyConfigurationsController(BaseTestCase):
    """RelayProxyConfigurationsController integration test stubs"""

    def test_delete_relay_proxy_config(self):
        """Test case for delete_relay_proxy_config

        Delete a relay proxy configuration by ID.
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/account/relay-auto-configs/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_relay_proxy_config(self):
        """Test case for get_relay_proxy_config

        Get a single relay proxy configuration by ID.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/account/relay-auto-configs/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_relay_proxy_configs(self):
        """Test case for get_relay_proxy_configs

        Returns a list of relay proxy configurations in the account.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/account/relay-auto-configs',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_relay_proxy_config(self):
        """Test case for patch_relay_proxy_config

        Modify a relay proxy configuration by ID.
        """
        patch_delta = {"op":"replace","path":"/name","value":"My resource name"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/account/relay-auto-configs/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(patch_delta),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_relay_auto_config(self):
        """Test case for post_relay_auto_config

        Create a new relay proxy config.
        """
        relay_proxy_config_body = openapi_server.PostRelayAutoConfigRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/account/relay-auto-configs',
            method='POST',
            headers=headers,
            data=json.dumps(relay_proxy_config_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reset_relay_proxy_config(self):
        """Test case for reset_relay_proxy_config

        Reset a relay proxy configuration's secret key with an optional expiry time for the old key.
        """
        query_string = [('expiry', 56)]
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/account/relay-auto-configs/{id}/reset'.format(id='id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
