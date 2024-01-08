import unittest

from flask import json

from openapi_server.models.list_service_response import ListServiceResponse  # noqa: E501
from openapi_server.models.notify_v1_service import NotifyV1Service  # noqa: E501
from openapi_server.test import BaseTestCase


class TestNotifyV1ServiceController(BaseTestCase):
    """NotifyV1ServiceController integration test stubs"""

    @unittest.skip("application/x-www-form-urlencoded not supported by Connexion")
    def test_create_service(self):
        """Test case for create_service

        
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/x-www-form-urlencoded',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        data = dict(alexa_skill_id='alexa_skill_id_example',
                    apn_credential_sid='apn_credential_sid_example',
                    default_alexa_notification_protocol_version='default_alexa_notification_protocol_version_example',
                    default_apn_notification_protocol_version='default_apn_notification_protocol_version_example',
                    default_fcm_notification_protocol_version='default_fcm_notification_protocol_version_example',
                    default_gcm_notification_protocol_version='default_gcm_notification_protocol_version_example',
                    delivery_callback_enabled=True,
                    delivery_callback_url='delivery_callback_url_example',
                    facebook_messenger_page_id='facebook_messenger_page_id_example',
                    fcm_credential_sid='fcm_credential_sid_example',
                    friendly_name='friendly_name_example',
                    gcm_credential_sid='gcm_credential_sid_example',
                    log_enabled=True,
                    messaging_service_sid='messaging_service_sid_example')
        response = self.client.open(
            '/v1/Services',
            method='POST',
            headers=headers,
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_service(self):
        """Test case for delete_service

        
        """
        headers = { 
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/v1/Services/{sid}'.format(sid='sid_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fetch_service(self):
        """Test case for fetch_service

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/v1/Services/{sid}'.format(sid='sid_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_service(self):
        """Test case for list_service

        
        """
        query_string = [('FriendlyName', 'friendly_name_example'),
                        ('PageSize', 56),
                        ('Page', 56),
                        ('PageToken', 'page_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/v1/Services',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/x-www-form-urlencoded not supported by Connexion")
    def test_update_service(self):
        """Test case for update_service

        
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/x-www-form-urlencoded',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        data = dict(alexa_skill_id='alexa_skill_id_example',
                    apn_credential_sid='apn_credential_sid_example',
                    default_alexa_notification_protocol_version='default_alexa_notification_protocol_version_example',
                    default_apn_notification_protocol_version='default_apn_notification_protocol_version_example',
                    default_fcm_notification_protocol_version='default_fcm_notification_protocol_version_example',
                    default_gcm_notification_protocol_version='default_gcm_notification_protocol_version_example',
                    delivery_callback_enabled=True,
                    delivery_callback_url='delivery_callback_url_example',
                    facebook_messenger_page_id='facebook_messenger_page_id_example',
                    fcm_credential_sid='fcm_credential_sid_example',
                    friendly_name='friendly_name_example',
                    gcm_credential_sid='gcm_credential_sid_example',
                    log_enabled=True,
                    messaging_service_sid='messaging_service_sid_example')
        response = self.client.open(
            '/v1/Services/{sid}'.format(sid='sid_example'),
            method='POST',
            headers=headers,
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
