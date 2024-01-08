import unittest

from flask import json

from openapi_server.models.program import Program  # noqa: E501
from openapi_server.models.programs import Programs  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProgramController(BaseTestCase):
    """ProgramController integration test stubs"""

    def test_get_opted_in_programs(self):
        """Test case for get_opted_in_programs

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/program/get_opted_in_programs',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_opt_in_to_program(self):
        """Test case for opt_in_to_program

        
        """
        program = {"programType":"programType"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/program/opt_in',
            method='POST',
            headers=headers,
            data=json.dumps(program),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_opt_out_of_program(self):
        """Test case for opt_out_of_program

        
        """
        program = {"programType":"programType"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/program/opt_out',
            method='POST',
            headers=headers,
            data=json.dumps(program),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
