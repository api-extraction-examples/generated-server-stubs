import unittest

from flask import json

from openapi_server.models.device_info import DeviceInfo  # noqa: E501
from openapi_server.models.device_info_query_result import DeviceInfoQueryResult  # noqa: E501
from openapi_server.models.device_options import DeviceOptions  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDevicesController(BaseTestCase):
    """DevicesController integration test stubs"""

    def test_delete_device(self):
        """Test case for delete_device

        Deletes a device.
        """
        query_string = [('id', 'id_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Devices',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_device_info(self):
        """Test case for get_device_info

        Get info for a device.
        """
        query_string = [('id', 'id_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Devices/Info',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_device_options(self):
        """Test case for get_device_options

        Get options for a device.
        """
        query_string = [('id', 'id_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Devices/Options',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_devices(self):
        """Test case for get_devices

        Get Devices.
        """
        query_string = [('supportsSync', True),
                        ('userId', 'user_id_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Devices',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_device_options(self):
        """Test case for update_device_options

        Update device options.
        """
        device_options = {"CustomName":"CustomName"}
        query_string = [('id', 'id_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Devices/Options',
            method='POST',
            headers=headers,
            data=json.dumps(device_options),
            content_type='application/*+json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
