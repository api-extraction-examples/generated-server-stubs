import unittest

from flask import json

from openapi_server.models.audit_log_entries import AuditLogEntries  # noqa: E501
from openapi_server.models.audit_log_entry import AuditLogEntry  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAuditLogController(BaseTestCase):
    """AuditLogController integration test stubs"""

    def test_get_audit_log_entries(self):
        """Test case for get_audit_log_entries

        Get a list of all audit log entries. The query parameters allow you to restrict the returned results by date ranges, resource specifiers, or a full-text search query.
        """
        query_string = [('before', 56),
                        ('after', 56),
                        ('q', 'q_example'),
                        ('limit', 3.4),
                        ('spec', 'spec_example')]
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/auditlog',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_audit_log_entry(self):
        """Test case for get_audit_log_entry

        Use this endpoint to fetch a single audit log entry by its resouce ID.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/auditlog/{resource_id}'.format(resource_id='resource_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
