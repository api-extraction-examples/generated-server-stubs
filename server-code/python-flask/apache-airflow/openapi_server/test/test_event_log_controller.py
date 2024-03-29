import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.event_log import EventLog  # noqa: E501
from openapi_server.models.event_log_collection import EventLogCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestEventLogController(BaseTestCase):
    """EventLogController integration test stubs"""

    def test_get_event_log(self):
        """Test case for get_event_log

        Get a log entry
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/eventLogs/{event_log_id}'.format(event_log_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_event_logs(self):
        """Test case for get_event_logs

        List log entries
        """
        query_string = [('limit', 100),
                        ('offset', 56),
                        ('order_by', 'order_by_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/eventLogs',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
