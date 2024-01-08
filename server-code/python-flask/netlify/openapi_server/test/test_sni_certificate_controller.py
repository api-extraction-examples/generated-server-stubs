import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.sni_certificate import SniCertificate  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSniCertificateController(BaseTestCase):
    """SniCertificateController integration test stubs"""

    def test_provision_site_tls_certificate(self):
        """Test case for provision_site_tls_certificate

        
        """
        query_string = [('certificate', 'certificate_example'),
                        ('key', 'key_example'),
                        ('ca_certificates', 'ca_certificates_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/ssl'.format(site_id='site_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_show_site_tls_certificate(self):
        """Test case for show_site_tls_certificate

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/ssl'.format(site_id='site_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
