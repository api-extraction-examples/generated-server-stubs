import unittest

from flask import json

from openapi_server.models.device_create_request import DeviceCreateRequest  # noqa: E501
from openapi_server.models.device_response import DeviceResponse  # noqa: E501
from openapi_server.models.device_update_request import DeviceUpdateRequest  # noqa: E501
from openapi_server.models.devices_response import DevicesResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDevicesController(BaseTestCase):
    """DevicesController integration test stubs"""

    def test_devices_create_instance(self):
        """Test case for devices_create_instance

        
        """
        device_create_request = {"data":{"attributes":{"name":"name","udid":"udid"},"type":"devices"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/devices',
            method='POST',
            headers=headers,
            data=json.dumps(device_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_devices_get_collection(self):
        """Test case for devices_get_collection

        
        """
        query_string = [('filter[name]', ['filter_name_example']),
                        ('filter[platform]', ['filter_platform_example']),
                        ('filter[status]', ['filter_status_example']),
                        ('filter[udid]', ['filter_udid_example']),
                        ('filter[id]', ['filter_id_example']),
                        ('sort', ['sort_example']),
                        ('fields[devices]', ['fields_devices_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/devices',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_devices_get_instance(self):
        """Test case for devices_get_instance

        
        """
        query_string = [('fields[devices]', ['fields_devices_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/devices/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_devices_update_instance(self):
        """Test case for devices_update_instance

        
        """
        device_update_request = {"data":{"attributes":{"name":"name","status":"ENABLED"},"id":"id","type":"devices"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/devices/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(device_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
