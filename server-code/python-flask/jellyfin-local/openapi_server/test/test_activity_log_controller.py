import unittest

from flask import json

from openapi_server.models.activity_log_entry_query_result import ActivityLogEntryQueryResult  # noqa: E501
from openapi_server.test import BaseTestCase


class TestActivityLogController(BaseTestCase):
    """ActivityLogController integration test stubs"""

    def test_get_log_entries(self):
        """Test case for get_log_entries

        Gets activity log entries.
        """
        query_string = [('startIndex', 56),
                        ('limit', 56),
                        ('minDate', '2013-10-20T19:20:30+01:00'),
                        ('hasUserId', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/ActivityLog/Entries',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
