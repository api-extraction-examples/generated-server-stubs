import unittest

from flask import json

from openapi_server.models.diagnostic_logs_response import DiagnosticLogsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDiagnosticSignaturesController(BaseTestCase):
    """DiagnosticSignaturesController integration test stubs"""

    def test_diagnostic_signatures_logs_get_to_many_related(self):
        """Test case for diagnostic_signatures_logs_get_to_many_related

        
        """
        query_string = [('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/diagnosticSignatures/{id}/logs'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
