import unittest

from flask import json

from openapi_server.models.app_encryption_declaration_response import AppEncryptionDeclarationResponse  # noqa: E501
from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.app_store_version_response import AppStoreVersionResponse  # noqa: E501
from openapi_server.models.beta_app_review_submission_response import BetaAppReviewSubmissionResponse  # noqa: E501
from openapi_server.models.beta_build_localizations_response import BetaBuildLocalizationsResponse  # noqa: E501
from openapi_server.models.beta_testers_response import BetaTestersResponse  # noqa: E501
from openapi_server.models.build_app_encryption_declaration_linkage_request import BuildAppEncryptionDeclarationLinkageRequest  # noqa: E501
from openapi_server.models.build_app_encryption_declaration_linkage_response import BuildAppEncryptionDeclarationLinkageResponse  # noqa: E501
from openapi_server.models.build_beta_detail_response import BuildBetaDetailResponse  # noqa: E501
from openapi_server.models.build_beta_groups_linkages_request import BuildBetaGroupsLinkagesRequest  # noqa: E501
from openapi_server.models.build_icons_response import BuildIconsResponse  # noqa: E501
from openapi_server.models.build_individual_testers_linkages_request import BuildIndividualTestersLinkagesRequest  # noqa: E501
from openapi_server.models.build_individual_testers_linkages_response import BuildIndividualTestersLinkagesResponse  # noqa: E501
from openapi_server.models.build_response import BuildResponse  # noqa: E501
from openapi_server.models.build_update_request import BuildUpdateRequest  # noqa: E501
from openapi_server.models.builds_response import BuildsResponse  # noqa: E501
from openapi_server.models.diagnostic_signatures_response import DiagnosticSignaturesResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.perf_power_metrics_response import PerfPowerMetricsResponse  # noqa: E501
from openapi_server.models.prerelease_version_response import PrereleaseVersionResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBuildsController(BaseTestCase):
    """BuildsController integration test stubs"""

    def test_builds_app_encryption_declaration_get_to_one_related(self):
        """Test case for builds_app_encryption_declaration_get_to_one_related

        
        """
        query_string = [('fields[appEncryptionDeclarations]', ['fields_app_encryption_declarations_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/appEncryptionDeclaration'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_app_encryption_declaration_get_to_one_relationship(self):
        """Test case for builds_app_encryption_declaration_get_to_one_relationship

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/relationships/appEncryptionDeclaration'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_app_encryption_declaration_update_to_one_relationship(self):
        """Test case for builds_app_encryption_declaration_update_to_one_relationship

        
        """
        build_app_encryption_declaration_linkage_request = {"data":{"id":"id","type":"appEncryptionDeclarations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/relationships/appEncryptionDeclaration'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(build_app_encryption_declaration_linkage_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_app_get_to_one_related(self):
        """Test case for builds_app_get_to_one_related

        
        """
        query_string = [('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/app'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_app_store_version_get_to_one_related(self):
        """Test case for builds_app_store_version_get_to_one_related

        
        """
        query_string = [('fields[appStoreVersions]', ['fields_app_store_versions_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/appStoreVersion'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_beta_app_review_submission_get_to_one_related(self):
        """Test case for builds_beta_app_review_submission_get_to_one_related

        
        """
        query_string = [('fields[betaAppReviewSubmissions]', ['fields_beta_app_review_submissions_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/betaAppReviewSubmission'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_beta_build_localizations_get_to_many_related(self):
        """Test case for builds_beta_build_localizations_get_to_many_related

        
        """
        query_string = [('fields[betaBuildLocalizations]', ['fields_beta_build_localizations_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/betaBuildLocalizations'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_beta_groups_create_to_many_relationship(self):
        """Test case for builds_beta_groups_create_to_many_relationship

        
        """
        build_beta_groups_linkages_request = {"data":[{"id":"id","type":"betaGroups"},{"id":"id","type":"betaGroups"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/relationships/betaGroups'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(build_beta_groups_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_beta_groups_delete_to_many_relationship(self):
        """Test case for builds_beta_groups_delete_to_many_relationship

        
        """
        build_beta_groups_linkages_request = {"data":[{"id":"id","type":"betaGroups"},{"id":"id","type":"betaGroups"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/relationships/betaGroups'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            data=json.dumps(build_beta_groups_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_build_beta_detail_get_to_one_related(self):
        """Test case for builds_build_beta_detail_get_to_one_related

        
        """
        query_string = [('fields[buildBetaDetails]', ['fields_build_beta_details_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/buildBetaDetail'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_diagnostic_signatures_get_to_many_related(self):
        """Test case for builds_diagnostic_signatures_get_to_many_related

        
        """
        query_string = [('filter[diagnosticType]', ['filter_diagnostic_type_example']),
                        ('fields[diagnosticSignatures]', ['fields_diagnostic_signatures_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/diagnosticSignatures'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_get_collection(self):
        """Test case for builds_get_collection

        
        """
        query_string = [('filter[betaAppReviewSubmission.betaReviewState]', ['filter_beta_app_review_submission_beta_review_state_example']),
                        ('filter[expired]', ['filter_expired_example']),
                        ('filter[preReleaseVersion.platform]', ['filter_pre_release_version_platform_example']),
                        ('filter[preReleaseVersion.version]', ['filter_pre_release_version_version_example']),
                        ('filter[processingState]', ['filter_processing_state_example']),
                        ('filter[usesNonExemptEncryption]', ['filter_uses_non_exempt_encryption_example']),
                        ('filter[version]', ['filter_version_example']),
                        ('filter[app]', ['filter_app_example']),
                        ('filter[appStoreVersion]', ['filter_app_store_version_example']),
                        ('filter[betaGroups]', ['filter_beta_groups_example']),
                        ('filter[preReleaseVersion]', ['filter_pre_release_version_example']),
                        ('filter[id]', ['filter_id_example']),
                        ('sort', ['sort_example']),
                        ('fields[builds]', ['fields_builds_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[appEncryptionDeclarations]', ['fields_app_encryption_declarations_example']),
                        ('fields[betaAppReviewSubmissions]', ['fields_beta_app_review_submissions_example']),
                        ('fields[buildBetaDetails]', ['fields_build_beta_details_example']),
                        ('fields[buildIcons]', ['fields_build_icons_example']),
                        ('fields[perfPowerMetrics]', ['fields_perf_power_metrics_example']),
                        ('fields[preReleaseVersions]', ['fields_pre_release_versions_example']),
                        ('fields[appStoreVersions]', ['fields_app_store_versions_example']),
                        ('fields[diagnosticSignatures]', ['fields_diagnostic_signatures_example']),
                        ('fields[betaTesters]', ['fields_beta_testers_example']),
                        ('fields[betaBuildLocalizations]', ['fields_beta_build_localizations_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[betaBuildLocalizations]', 56),
                        ('limit[icons]', 56),
                        ('limit[individualTesters]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_get_instance(self):
        """Test case for builds_get_instance

        
        """
        query_string = [('fields[builds]', ['fields_builds_example']),
                        ('include', ['include_example']),
                        ('fields[appEncryptionDeclarations]', ['fields_app_encryption_declarations_example']),
                        ('fields[betaAppReviewSubmissions]', ['fields_beta_app_review_submissions_example']),
                        ('fields[buildBetaDetails]', ['fields_build_beta_details_example']),
                        ('fields[buildIcons]', ['fields_build_icons_example']),
                        ('fields[perfPowerMetrics]', ['fields_perf_power_metrics_example']),
                        ('fields[preReleaseVersions]', ['fields_pre_release_versions_example']),
                        ('fields[appStoreVersions]', ['fields_app_store_versions_example']),
                        ('fields[diagnosticSignatures]', ['fields_diagnostic_signatures_example']),
                        ('fields[betaTesters]', ['fields_beta_testers_example']),
                        ('fields[betaBuildLocalizations]', ['fields_beta_build_localizations_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[betaBuildLocalizations]', 56),
                        ('limit[icons]', 56),
                        ('limit[individualTesters]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_icons_get_to_many_related(self):
        """Test case for builds_icons_get_to_many_related

        
        """
        query_string = [('fields[buildIcons]', ['fields_build_icons_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/icons'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_individual_testers_create_to_many_relationship(self):
        """Test case for builds_individual_testers_create_to_many_relationship

        
        """
        build_individual_testers_linkages_request = {"data":[{"id":"id","type":"betaTesters"},{"id":"id","type":"betaTesters"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/relationships/individualTesters'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(build_individual_testers_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_individual_testers_delete_to_many_relationship(self):
        """Test case for builds_individual_testers_delete_to_many_relationship

        
        """
        build_individual_testers_linkages_request = {"data":[{"id":"id","type":"betaTesters"},{"id":"id","type":"betaTesters"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/relationships/individualTesters'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            data=json.dumps(build_individual_testers_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_individual_testers_get_to_many_related(self):
        """Test case for builds_individual_testers_get_to_many_related

        
        """
        query_string = [('fields[betaTesters]', ['fields_beta_testers_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/individualTesters'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_individual_testers_get_to_many_relationship(self):
        """Test case for builds_individual_testers_get_to_many_relationship

        
        """
        query_string = [('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/relationships/individualTesters'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_perf_power_metrics_get_to_many_related(self):
        """Test case for builds_perf_power_metrics_get_to_many_related

        
        """
        query_string = [('filter[deviceType]', ['filter_device_type_example']),
                        ('filter[metricType]', ['filter_metric_type_example']),
                        ('filter[platform]', ['filter_platform_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/perfPowerMetrics'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_pre_release_version_get_to_one_related(self):
        """Test case for builds_pre_release_version_get_to_one_related

        
        """
        query_string = [('fields[preReleaseVersions]', ['fields_pre_release_versions_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}/preReleaseVersion'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_builds_update_instance(self):
        """Test case for builds_update_instance

        
        """
        build_update_request = {"data":{"relationships":{"appEncryptionDeclaration":{"data":{"id":"id","type":"appEncryptionDeclarations"}}},"attributes":{"expired":True,"usesNonExemptEncryption":True},"id":"id","type":"builds"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/builds/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(build_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
