import unittest

from flask import json

from openapi_server.models.build_beta_notification_create_request import BuildBetaNotificationCreateRequest  # noqa: E501
from openapi_server.models.build_beta_notification_response import BuildBetaNotificationResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBuildBetaNotificationsController(BaseTestCase):
    """BuildBetaNotificationsController integration test stubs"""

    def test_build_beta_notifications_create_instance(self):
        """Test case for build_beta_notifications_create_instance

        
        """
        build_beta_notification_create_request = {"data":{"relationships":{"build":{"data":{"id":"id","type":"builds"}}},"type":"buildBetaNotifications"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/buildBetaNotifications',
            method='POST',
            headers=headers,
            data=json.dumps(build_beta_notification_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
