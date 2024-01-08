from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.report_format_type import ReportFormatType
from openapi_server import util

from openapi_server.models.report_format_type import ReportFormatType  # noqa: E501

class GetCredentialReportResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, content=None, report_format=None, generated_time=None):  # noqa: E501
        """GetCredentialReportResponse - a model defined in OpenAPI

        :param content: The content of this GetCredentialReportResponse.  # noqa: E501
        :type content: str
        :param report_format: The report_format of this GetCredentialReportResponse.  # noqa: E501
        :type report_format: ReportFormatType
        :param generated_time: The generated_time of this GetCredentialReportResponse.  # noqa: E501
        :type generated_time: datetime
        """
        self.openapi_types = {
            'content': str,
            'report_format': ReportFormatType,
            'generated_time': datetime
        }

        self.attribute_map = {
            'content': 'Content',
            'report_format': 'ReportFormat',
            'generated_time': 'GeneratedTime'
        }

        self._content = content
        self._report_format = report_format
        self._generated_time = generated_time

    @classmethod
    def from_dict(cls, dikt) -> 'GetCredentialReportResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetCredentialReportResponse of this GetCredentialReportResponse.  # noqa: E501
        :rtype: GetCredentialReportResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def content(self) -> str:
        """Gets the content of this GetCredentialReportResponse.


        :return: The content of this GetCredentialReportResponse.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content: str):
        """Sets the content of this GetCredentialReportResponse.


        :param content: The content of this GetCredentialReportResponse.
        :type content: str
        """

        self._content = content

    @property
    def report_format(self) -> ReportFormatType:
        """Gets the report_format of this GetCredentialReportResponse.


        :return: The report_format of this GetCredentialReportResponse.
        :rtype: ReportFormatType
        """
        return self._report_format

    @report_format.setter
    def report_format(self, report_format: ReportFormatType):
        """Sets the report_format of this GetCredentialReportResponse.


        :param report_format: The report_format of this GetCredentialReportResponse.
        :type report_format: ReportFormatType
        """

        self._report_format = report_format

    @property
    def generated_time(self) -> datetime:
        """Gets the generated_time of this GetCredentialReportResponse.


        :return: The generated_time of this GetCredentialReportResponse.
        :rtype: datetime
        """
        return self._generated_time

    @generated_time.setter
    def generated_time(self, generated_time: datetime):
        """Sets the generated_time of this GetCredentialReportResponse.


        :param generated_time: The generated_time of this GetCredentialReportResponse.
        :type generated_time: datetime
        """

        self._generated_time = generated_time