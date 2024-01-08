import unittest

from flask import json

from openapi_server.models.binding_enum_binding_type import BindingEnumBindingType  # noqa: E501
from openapi_server.models.list_binding_response import ListBindingResponse  # noqa: E501
from openapi_server.models.notify_v1_service_binding import NotifyV1ServiceBinding  # noqa: E501
from openapi_server.test import BaseTestCase


class TestNotifyV1BindingController(BaseTestCase):
    """NotifyV1BindingController integration test stubs"""

    @unittest.skip("application/x-www-form-urlencoded not supported by Connexion")
    def test_create_binding(self):
        """Test case for create_binding

        
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/x-www-form-urlencoded',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        data = dict(address='address_example',
                    binding_type=openapi_server.BindingEnumBindingType(),
                    credential_sid='credential_sid_example',
                    endpoint='endpoint_example',
                    identity='identity_example',
                    notification_protocol_version='notification_protocol_version_example',
                    tag=['tag_example'])
        response = self.client.open(
            '/v1/Services/{service_sid}/Bindings'.format(service_sid='service_sid_example'),
            method='POST',
            headers=headers,
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_binding(self):
        """Test case for delete_binding

        
        """
        headers = { 
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/v1/Services/{service_sid}/Bindings/{sid}'.format(service_sid='service_sid_example', sid='sid_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fetch_binding(self):
        """Test case for fetch_binding

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/v1/Services/{service_sid}/Bindings/{sid}'.format(service_sid='service_sid_example', sid='sid_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_binding(self):
        """Test case for list_binding

        
        """
        query_string = [('StartDate', '2013-10-20'),
                        ('EndDate', '2013-10-20'),
                        ('Identity', ['identity_example']),
                        ('Tag', ['tag_example']),
                        ('PageSize', 56),
                        ('Page', 56),
                        ('PageToken', 'page_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/v1/Services/{service_sid}/Bindings'.format(service_sid='service_sid_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
