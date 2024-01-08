import unittest

from flask import json

from openapi_server.models.notification_enum_priority import NotificationEnumPriority  # noqa: E501
from openapi_server.models.notify_v1_service_notification import NotifyV1ServiceNotification  # noqa: E501
from openapi_server.test import BaseTestCase


class TestNotifyV1NotificationController(BaseTestCase):
    """NotifyV1NotificationController integration test stubs"""

    @unittest.skip("application/x-www-form-urlencoded not supported by Connexion")
    def test_create_notification(self):
        """Test case for create_notification

        
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/x-www-form-urlencoded',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        data = dict(action='action_example',
                    alexa=None,
                    apn=None,
                    body='body_example',
                    data=None,
                    delivery_callback_url='delivery_callback_url_example',
                    facebook_messenger=None,
                    fcm=None,
                    gcm=None,
                    identity=['identity_example'],
                    priority=openapi_server.NotificationEnumPriority(),
                    segment=['segment_example'],
                    sms=None,
                    sound='sound_example',
                    tag=['tag_example'],
                    title='title_example',
                    to_binding=['to_binding_example'],
                    ttl=56)
        response = self.client.open(
            '/v1/Services/{service_sid}/Notifications'.format(service_sid='service_sid_example'),
            method='POST',
            headers=headers,
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
