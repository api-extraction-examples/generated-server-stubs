from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class KycCheck(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, alert=None, data_required=None, detail_message=None, due_date=None, remedy_url=None):  # noqa: E501
        """KycCheck - a model defined in OpenAPI

        :param alert: The alert of this KycCheck.  # noqa: E501
        :type alert: str
        :param data_required: The data_required of this KycCheck.  # noqa: E501
        :type data_required: str
        :param detail_message: The detail_message of this KycCheck.  # noqa: E501
        :type detail_message: str
        :param due_date: The due_date of this KycCheck.  # noqa: E501
        :type due_date: str
        :param remedy_url: The remedy_url of this KycCheck.  # noqa: E501
        :type remedy_url: str
        """
        self.openapi_types = {
            'alert': str,
            'data_required': str,
            'detail_message': str,
            'due_date': str,
            'remedy_url': str
        }

        self.attribute_map = {
            'alert': 'alert',
            'data_required': 'dataRequired',
            'detail_message': 'detailMessage',
            'due_date': 'dueDate',
            'remedy_url': 'remedyUrl'
        }

        self._alert = alert
        self._data_required = data_required
        self._detail_message = detail_message
        self._due_date = due_date
        self._remedy_url = remedy_url

    @classmethod
    def from_dict(cls, dikt) -> 'KycCheck':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The KycCheck of this KycCheck.  # noqa: E501
        :rtype: KycCheck
        """
        return util.deserialize_model(dikt, cls)

    @property
    def alert(self) -> str:
        """Gets the alert of this KycCheck.

        This field gives a short summary of what is required from the seller. An example might be, '<code>Upload bank document now.</code>'. The <b>detailMessage</b> field will often provide more details on what is required of the seller.  # noqa: E501

        :return: The alert of this KycCheck.
        :rtype: str
        """
        return self._alert

    @alert.setter
    def alert(self, alert: str):
        """Sets the alert of this KycCheck.

        This field gives a short summary of what is required from the seller. An example might be, '<code>Upload bank document now.</code>'. The <b>detailMessage</b> field will often provide more details on what is required of the seller.  # noqa: E501

        :param alert: The alert of this KycCheck.
        :type alert: str
        """

        self._alert = alert

    @property
    def data_required(self) -> str:
        """Gets the data_required of this KycCheck.

        The enumeration value returned in this field categorizes the type of details needed for the KYC check. More information about the check is shown in the <b>detailMessage</b> and other applicable, corresponding fields. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/kyc:DetailsType'>eBay API documentation</a>  # noqa: E501

        :return: The data_required of this KycCheck.
        :rtype: str
        """
        return self._data_required

    @data_required.setter
    def data_required(self, data_required: str):
        """Sets the data_required of this KycCheck.

        The enumeration value returned in this field categorizes the type of details needed for the KYC check. More information about the check is shown in the <b>detailMessage</b> and other applicable, corresponding fields. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/kyc:DetailsType'>eBay API documentation</a>  # noqa: E501

        :param data_required: The data_required of this KycCheck.
        :type data_required: str
        """

        self._data_required = data_required

    @property
    def detail_message(self) -> str:
        """Gets the detail_message of this KycCheck.

        This field gives a detailed message about what is required from the seller. An example might be, '<code>Please upload a bank document by 2020-08-01 to get your account back in good standing.</code>'.  # noqa: E501

        :return: The detail_message of this KycCheck.
        :rtype: str
        """
        return self._detail_message

    @detail_message.setter
    def detail_message(self, detail_message: str):
        """Sets the detail_message of this KycCheck.

        This field gives a detailed message about what is required from the seller. An example might be, '<code>Please upload a bank document by 2020-08-01 to get your account back in good standing.</code>'.  # noqa: E501

        :param detail_message: The detail_message of this KycCheck.
        :type detail_message: str
        """

        self._detail_message = detail_message

    @property
    def due_date(self) -> str:
        """Gets the due_date of this KycCheck.

        The timestamp in this field indicates the date by which the seller should resolve the KYC requirement.<br><br>The timestamp in this field uses the UTC date and time format described in the <a href=\"https://www.iso.org/iso-8601-date-and-time-format.html\" target=\"_blank\">ISO 8601 Standard</a>. See below for this format and an example: <br><br><i>MM-DD-YYYY HH:MM:SS</i><br/><code>06-05-2020 10:34:18</code>  # noqa: E501

        :return: The due_date of this KycCheck.
        :rtype: str
        """
        return self._due_date

    @due_date.setter
    def due_date(self, due_date: str):
        """Sets the due_date of this KycCheck.

        The timestamp in this field indicates the date by which the seller should resolve the KYC requirement.<br><br>The timestamp in this field uses the UTC date and time format described in the <a href=\"https://www.iso.org/iso-8601-date-and-time-format.html\" target=\"_blank\">ISO 8601 Standard</a>. See below for this format and an example: <br><br><i>MM-DD-YYYY HH:MM:SS</i><br/><code>06-05-2020 10:34:18</code>  # noqa: E501

        :param due_date: The due_date of this KycCheck.
        :type due_date: str
        """

        self._due_date = due_date

    @property
    def remedy_url(self) -> str:
        """Gets the remedy_url of this KycCheck.

        If applicable and available, a URL will be returned in this field, and the link will take the seller to an eBay page where they can provide the requested information.  # noqa: E501

        :return: The remedy_url of this KycCheck.
        :rtype: str
        """
        return self._remedy_url

    @remedy_url.setter
    def remedy_url(self, remedy_url: str):
        """Sets the remedy_url of this KycCheck.

        If applicable and available, a URL will be returned in this field, and the link will take the seller to an eBay page where they can provide the requested information.  # noqa: E501

        :param remedy_url: The remedy_url of this KycCheck.
        :type remedy_url: str
        """

        self._remedy_url = remedy_url