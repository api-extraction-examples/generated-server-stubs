import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_audit_log_events200_response import GetAuditLogEvents200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAuditLogAPIController(BaseTestCase):
    """AuditLogAPIController integration test stubs"""

    def test_get_audit_log_events(self):
        """Test case for get_audit_log_events

        Get audit log events
        """
        query_string = [('start_at', '2013-10-20T19:20:30+01:00'),
                        ('end_at', '2013-10-20T19:20:30+01:00'),
                        ('event_type', 'event_type_example'),
                        ('actor_type', 'actor_type_example'),
                        ('actor_gid', 'actor_gid_example'),
                        ('resource_gid', 'resource_gid_example'),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspaces/{workspace_gid}/audit_log_events'.format(workspace_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
