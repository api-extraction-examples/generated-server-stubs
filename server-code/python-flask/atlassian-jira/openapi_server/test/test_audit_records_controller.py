import unittest

from flask import json

from openapi_server.models.audit_records import AuditRecords  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAuditRecordsController(BaseTestCase):
    """AuditRecordsController integration test stubs"""

    def test_get_audit_records(self):
        """Test case for get_audit_records

        Get audit records
        """
        query_string = [('offset', 0),
                        ('limit', 1000),
                        ('filter', 'filter_example'),
                        ('from', '2013-10-20T19:20:30+01:00'),
                        ('to', '2013-10-20T19:20:30+01:00')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/auditing/record',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
