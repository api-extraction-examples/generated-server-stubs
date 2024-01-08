import unittest

from flask import json

from openapi_server.models.audit_log import AuditLog  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAuditLogController(BaseTestCase):
    """AuditLogController integration test stubs"""

    def test_list_account_audit_events(self):
        """Test case for list_account_audit_events

        
        """
        query_string = [('query', 'query_example'),
                        ('log_type', 'log_type_example'),
                        ('page', 56),
                        ('per_page', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{account_id}/audit'.format(account_id='account_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
