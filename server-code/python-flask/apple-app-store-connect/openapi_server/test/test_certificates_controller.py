import unittest

from flask import json

from openapi_server.models.certificate_create_request import CertificateCreateRequest  # noqa: E501
from openapi_server.models.certificate_response import CertificateResponse  # noqa: E501
from openapi_server.models.certificates_response import CertificatesResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCertificatesController(BaseTestCase):
    """CertificatesController integration test stubs"""

    def test_certificates_create_instance(self):
        """Test case for certificates_create_instance

        
        """
        certificate_create_request = {"data":{"attributes":{"csrContent":"csrContent"},"type":"certificates"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/certificates',
            method='POST',
            headers=headers,
            data=json.dumps(certificate_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_certificates_delete_instance(self):
        """Test case for certificates_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/certificates/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_certificates_get_collection(self):
        """Test case for certificates_get_collection

        
        """
        query_string = [('filter[certificateType]', ['filter_certificate_type_example']),
                        ('filter[displayName]', ['filter_display_name_example']),
                        ('filter[serialNumber]', ['filter_serial_number_example']),
                        ('filter[id]', ['filter_id_example']),
                        ('sort', ['sort_example']),
                        ('fields[certificates]', ['fields_certificates_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/certificates',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_certificates_get_instance(self):
        """Test case for certificates_get_instance

        
        """
        query_string = [('fields[certificates]', ['fields_certificates_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/certificates/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
