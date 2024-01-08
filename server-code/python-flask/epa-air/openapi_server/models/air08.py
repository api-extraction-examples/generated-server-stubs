from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.air01 import Air01
from openapi_server.models.air06 import Air06
from openapi_server.models.qp0 import Qp0
from openapi_server import util

from openapi_server.models.air01 import Air01  # noqa: E501
from openapi_server.models.air06 import Air06  # noqa: E501
from openapi_server.models.qp0 import Qp0  # noqa: E501

class Air08(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, bad_system_ids=None, cv_rows=None, cluster_output=None, cluster_records=None, fea_rows=None, facilities=None, insp_rows=None, icon_base_url=None, indian_country_rows=None, inf_fea_rows=None, message=None, pop_up_base_url=None, query_id=None, query_parameters=None, query_rows=None, sv_rows=None, service_base_url=None, total_penalties=None, v3_rows=None):  # noqa: E501
        """Air08 - a model defined in OpenAPI

        :param bad_system_ids: The bad_system_ids of this Air08.  # noqa: E501
        :type bad_system_ids: str
        :param cv_rows: The cv_rows of this Air08.  # noqa: E501
        :type cv_rows: str
        :param cluster_output: The cluster_output of this Air08.  # noqa: E501
        :type cluster_output: Air01
        :param cluster_records: The cluster_records of this Air08.  # noqa: E501
        :type cluster_records: str
        :param fea_rows: The fea_rows of this Air08.  # noqa: E501
        :type fea_rows: str
        :param facilities: The facilities of this Air08.  # noqa: E501
        :type facilities: List[Air06]
        :param insp_rows: The insp_rows of this Air08.  # noqa: E501
        :type insp_rows: str
        :param icon_base_url: The icon_base_url of this Air08.  # noqa: E501
        :type icon_base_url: str
        :param indian_country_rows: The indian_country_rows of this Air08.  # noqa: E501
        :type indian_country_rows: str
        :param inf_fea_rows: The inf_fea_rows of this Air08.  # noqa: E501
        :type inf_fea_rows: str
        :param message: The message of this Air08.  # noqa: E501
        :type message: str
        :param pop_up_base_url: The pop_up_base_url of this Air08.  # noqa: E501
        :type pop_up_base_url: str
        :param query_id: The query_id of this Air08.  # noqa: E501
        :type query_id: str
        :param query_parameters: The query_parameters of this Air08.  # noqa: E501
        :type query_parameters: List[Qp0]
        :param query_rows: The query_rows of this Air08.  # noqa: E501
        :type query_rows: str
        :param sv_rows: The sv_rows of this Air08.  # noqa: E501
        :type sv_rows: str
        :param service_base_url: The service_base_url of this Air08.  # noqa: E501
        :type service_base_url: str
        :param total_penalties: The total_penalties of this Air08.  # noqa: E501
        :type total_penalties: str
        :param v3_rows: The v3_rows of this Air08.  # noqa: E501
        :type v3_rows: str
        """
        self.openapi_types = {
            'bad_system_ids': str,
            'cv_rows': str,
            'cluster_output': Air01,
            'cluster_records': str,
            'fea_rows': str,
            'facilities': List[Air06],
            'insp_rows': str,
            'icon_base_url': str,
            'indian_country_rows': str,
            'inf_fea_rows': str,
            'message': str,
            'pop_up_base_url': str,
            'query_id': str,
            'query_parameters': List[Qp0],
            'query_rows': str,
            'sv_rows': str,
            'service_base_url': str,
            'total_penalties': str,
            'v3_rows': str
        }

        self.attribute_map = {
            'bad_system_ids': 'BadSystemIDs',
            'cv_rows': 'CVRows',
            'cluster_output': 'ClusterOutput',
            'cluster_records': 'ClusterRecords',
            'fea_rows': 'FEARows',
            'facilities': 'Facilities',
            'insp_rows': 'INSPRows',
            'icon_base_url': 'IconBaseURL',
            'indian_country_rows': 'IndianCountryRows',
            'inf_fea_rows': 'InfFEARows',
            'message': 'Message',
            'pop_up_base_url': 'PopUpBaseURL',
            'query_id': 'QueryID',
            'query_parameters': 'QueryParameters',
            'query_rows': 'QueryRows',
            'sv_rows': 'SVRows',
            'service_base_url': 'ServiceBaseURL',
            'total_penalties': 'TotalPenalties',
            'v3_rows': 'V3Rows'
        }

        self._bad_system_ids = bad_system_ids
        self._cv_rows = cv_rows
        self._cluster_output = cluster_output
        self._cluster_records = cluster_records
        self._fea_rows = fea_rows
        self._facilities = facilities
        self._insp_rows = insp_rows
        self._icon_base_url = icon_base_url
        self._indian_country_rows = indian_country_rows
        self._inf_fea_rows = inf_fea_rows
        self._message = message
        self._pop_up_base_url = pop_up_base_url
        self._query_id = query_id
        self._query_parameters = query_parameters
        self._query_rows = query_rows
        self._sv_rows = sv_rows
        self._service_base_url = service_base_url
        self._total_penalties = total_penalties
        self._v3_rows = v3_rows

    @classmethod
    def from_dict(cls, dikt) -> 'Air08':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The air08 of this Air08.  # noqa: E501
        :rtype: Air08
        """
        return util.deserialize_model(dikt, cls)

    @property
    def bad_system_ids(self) -> str:
        """Gets the bad_system_ids of this Air08.

        Identifies which passed query system identifiers are invalid.  # noqa: E501

        :return: The bad_system_ids of this Air08.
        :rtype: str
        """
        return self._bad_system_ids

    @bad_system_ids.setter
    def bad_system_ids(self, bad_system_ids: str):
        """Sets the bad_system_ids of this Air08.

        Identifies which passed query system identifiers are invalid.  # noqa: E501

        :param bad_system_ids: The bad_system_ids of this Air08.
        :type bad_system_ids: str
        """
        if bad_system_ids is None:
            raise ValueError("Invalid value for `bad_system_ids`, must not be `None`")  # noqa: E501

        self._bad_system_ids = bad_system_ids

    @property
    def cv_rows(self) -> str:
        """Gets the cv_rows of this Air08.

        Summary count of the number of CWA facilities or SDWA public drinking water systems with current violations.  # noqa: E501

        :return: The cv_rows of this Air08.
        :rtype: str
        """
        return self._cv_rows

    @cv_rows.setter
    def cv_rows(self, cv_rows: str):
        """Sets the cv_rows of this Air08.

        Summary count of the number of CWA facilities or SDWA public drinking water systems with current violations.  # noqa: E501

        :param cv_rows: The cv_rows of this Air08.
        :type cv_rows: str
        """
        if cv_rows is None:
            raise ValueError("Invalid value for `cv_rows`, must not be `None`")  # noqa: E501

        self._cv_rows = cv_rows

    @property
    def cluster_output(self) -> Air01:
        """Gets the cluster_output of this Air08.


        :return: The cluster_output of this Air08.
        :rtype: Air01
        """
        return self._cluster_output

    @cluster_output.setter
    def cluster_output(self, cluster_output: Air01):
        """Sets the cluster_output of this Air08.


        :param cluster_output: The cluster_output of this Air08.
        :type cluster_output: Air01
        """

        self._cluster_output = cluster_output

    @property
    def cluster_records(self) -> str:
        """Gets the cluster_records of this Air08.

        Number of clusters returned.  # noqa: E501

        :return: The cluster_records of this Air08.
        :rtype: str
        """
        return self._cluster_records

    @cluster_records.setter
    def cluster_records(self, cluster_records: str):
        """Sets the cluster_records of this Air08.

        Number of clusters returned.  # noqa: E501

        :param cluster_records: The cluster_records of this Air08.
        :type cluster_records: str
        """

        self._cluster_records = cluster_records

    @property
    def fea_rows(self) -> str:
        """Gets the fea_rows of this Air08.

        Summary count of the number of facilities with a formal enforcement action in the past five years  # noqa: E501

        :return: The fea_rows of this Air08.
        :rtype: str
        """
        return self._fea_rows

    @fea_rows.setter
    def fea_rows(self, fea_rows: str):
        """Sets the fea_rows of this Air08.

        Summary count of the number of facilities with a formal enforcement action in the past five years  # noqa: E501

        :param fea_rows: The fea_rows of this Air08.
        :type fea_rows: str
        """
        if fea_rows is None:
            raise ValueError("Invalid value for `fea_rows`, must not be `None`")  # noqa: E501

        self._fea_rows = fea_rows

    @property
    def facilities(self) -> List[Air06]:
        """Gets the facilities of this Air08.

        A complex array of facility information.  # noqa: E501

        :return: The facilities of this Air08.
        :rtype: List[Air06]
        """
        return self._facilities

    @facilities.setter
    def facilities(self, facilities: List[Air06]):
        """Sets the facilities of this Air08.

        A complex array of facility information.  # noqa: E501

        :param facilities: The facilities of this Air08.
        :type facilities: List[Air06]
        """

        self._facilities = facilities

    @property
    def insp_rows(self) -> str:
        """Gets the insp_rows of this Air08.

        Number of facilities with insp_5yr_flag populated (CWP_DATE_LAST_INSPECTION)  # noqa: E501

        :return: The insp_rows of this Air08.
        :rtype: str
        """
        return self._insp_rows

    @insp_rows.setter
    def insp_rows(self, insp_rows: str):
        """Sets the insp_rows of this Air08.

        Number of facilities with insp_5yr_flag populated (CWP_DATE_LAST_INSPECTION)  # noqa: E501

        :param insp_rows: The insp_rows of this Air08.
        :type insp_rows: str
        """
        if insp_rows is None:
            raise ValueError("Invalid value for `insp_rows`, must not be `None`")  # noqa: E501

        self._insp_rows = insp_rows

    @property
    def icon_base_url(self) -> str:
        """Gets the icon_base_url of this Air08.

        URL where all the icons are located  # noqa: E501

        :return: The icon_base_url of this Air08.
        :rtype: str
        """
        return self._icon_base_url

    @icon_base_url.setter
    def icon_base_url(self, icon_base_url: str):
        """Sets the icon_base_url of this Air08.

        URL where all the icons are located  # noqa: E501

        :param icon_base_url: The icon_base_url of this Air08.
        :type icon_base_url: str
        """
        if icon_base_url is None:
            raise ValueError("Invalid value for `icon_base_url`, must not be `None`")  # noqa: E501

        self._icon_base_url = icon_base_url

    @property
    def indian_country_rows(self) -> str:
        """Gets the indian_country_rows of this Air08.

        Number of facilities with tribal_flag populated  # noqa: E501

        :return: The indian_country_rows of this Air08.
        :rtype: str
        """
        return self._indian_country_rows

    @indian_country_rows.setter
    def indian_country_rows(self, indian_country_rows: str):
        """Sets the indian_country_rows of this Air08.

        Number of facilities with tribal_flag populated  # noqa: E501

        :param indian_country_rows: The indian_country_rows of this Air08.
        :type indian_country_rows: str
        """
        if indian_country_rows is None:
            raise ValueError("Invalid value for `indian_country_rows`, must not be `None`")  # noqa: E501

        self._indian_country_rows = indian_country_rows

    @property
    def inf_fea_rows(self) -> str:
        """Gets the inf_fea_rows of this Air08.

        Number of facilities with infea_5yr_flag populated (INFORMAL_ENF_ACT_COUNT > 0)  # noqa: E501

        :return: The inf_fea_rows of this Air08.
        :rtype: str
        """
        return self._inf_fea_rows

    @inf_fea_rows.setter
    def inf_fea_rows(self, inf_fea_rows: str):
        """Sets the inf_fea_rows of this Air08.

        Number of facilities with infea_5yr_flag populated (INFORMAL_ENF_ACT_COUNT > 0)  # noqa: E501

        :param inf_fea_rows: The inf_fea_rows of this Air08.
        :type inf_fea_rows: str
        """
        if inf_fea_rows is None:
            raise ValueError("Invalid value for `inf_fea_rows`, must not be `None`")  # noqa: E501

        self._inf_fea_rows = inf_fea_rows

    @property
    def message(self) -> str:
        """Gets the message of this Air08.

        Field to record messages (typically performance-related) about packet processing  # noqa: E501

        :return: The message of this Air08.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this Air08.

        Field to record messages (typically performance-related) about packet processing  # noqa: E501

        :param message: The message of this Air08.
        :type message: str
        """
        if message is None:
            raise ValueError("Invalid value for `message`, must not be `None`")  # noqa: E501

        self._message = message

    @property
    def pop_up_base_url(self) -> str:
        """Gets the pop_up_base_url of this Air08.

        Combine this URL with the PUC to get popup info  # noqa: E501

        :return: The pop_up_base_url of this Air08.
        :rtype: str
        """
        return self._pop_up_base_url

    @pop_up_base_url.setter
    def pop_up_base_url(self, pop_up_base_url: str):
        """Sets the pop_up_base_url of this Air08.

        Combine this URL with the PUC to get popup info  # noqa: E501

        :param pop_up_base_url: The pop_up_base_url of this Air08.
        :type pop_up_base_url: str
        """
        if pop_up_base_url is None:
            raise ValueError("Invalid value for `pop_up_base_url`, must not be `None`")  # noqa: E501

        self._pop_up_base_url = pop_up_base_url

    @property
    def query_id(self) -> str:
        """Gets the query_id of this Air08.

        Sequential number assigned to entire search result  # noqa: E501

        :return: The query_id of this Air08.
        :rtype: str
        """
        return self._query_id

    @query_id.setter
    def query_id(self, query_id: str):
        """Sets the query_id of this Air08.

        Sequential number assigned to entire search result  # noqa: E501

        :param query_id: The query_id of this Air08.
        :type query_id: str
        """
        if query_id is None:
            raise ValueError("Invalid value for `query_id`, must not be `None`")  # noqa: E501

        self._query_id = query_id

    @property
    def query_parameters(self) -> List[Qp0]:
        """Gets the query_parameters of this Air08.

        A list of submitted query parameters and their values.  # noqa: E501

        :return: The query_parameters of this Air08.
        :rtype: List[Qp0]
        """
        return self._query_parameters

    @query_parameters.setter
    def query_parameters(self, query_parameters: List[Qp0]):
        """Sets the query_parameters of this Air08.

        A list of submitted query parameters and their values.  # noqa: E501

        :param query_parameters: The query_parameters of this Air08.
        :type query_parameters: List[Qp0]
        """
        if query_parameters is None:
            raise ValueError("Invalid value for `query_parameters`, must not be `None`")  # noqa: E501

        self._query_parameters = query_parameters

    @property
    def query_rows(self) -> str:
        """Gets the query_rows of this Air08.

        Number of query results returned  # noqa: E501

        :return: The query_rows of this Air08.
        :rtype: str
        """
        return self._query_rows

    @query_rows.setter
    def query_rows(self, query_rows: str):
        """Sets the query_rows of this Air08.

        Number of query results returned  # noqa: E501

        :param query_rows: The query_rows of this Air08.
        :type query_rows: str
        """
        if query_rows is None:
            raise ValueError("Invalid value for `query_rows`, must not be `None`")  # noqa: E501

        self._query_rows = query_rows

    @property
    def sv_rows(self) -> str:
        """Gets the sv_rows of this Air08.

        Number of facilities with curr_sv_flag populated (CWP_STATUS = \"Significant Violation\")  # noqa: E501

        :return: The sv_rows of this Air08.
        :rtype: str
        """
        return self._sv_rows

    @sv_rows.setter
    def sv_rows(self, sv_rows: str):
        """Sets the sv_rows of this Air08.

        Number of facilities with curr_sv_flag populated (CWP_STATUS = \"Significant Violation\")  # noqa: E501

        :param sv_rows: The sv_rows of this Air08.
        :type sv_rows: str
        """
        if sv_rows is None:
            raise ValueError("Invalid value for `sv_rows`, must not be `None`")  # noqa: E501

        self._sv_rows = sv_rows

    @property
    def service_base_url(self) -> str:
        """Gets the service_base_url of this Air08.

        The base service URL.  # noqa: E501

        :return: The service_base_url of this Air08.
        :rtype: str
        """
        return self._service_base_url

    @service_base_url.setter
    def service_base_url(self, service_base_url: str):
        """Sets the service_base_url of this Air08.

        The base service URL.  # noqa: E501

        :param service_base_url: The service_base_url of this Air08.
        :type service_base_url: str
        """
        if service_base_url is None:
            raise ValueError("Invalid value for `service_base_url`, must not be `None`")  # noqa: E501

        self._service_base_url = service_base_url

    @property
    def total_penalties(self) -> str:
        """Gets the total_penalties of this Air08.

        The total dollar amount of either assessed or final penalties within the five year time period  # noqa: E501

        :return: The total_penalties of this Air08.
        :rtype: str
        """
        return self._total_penalties

    @total_penalties.setter
    def total_penalties(self, total_penalties: str):
        """Sets the total_penalties of this Air08.

        The total dollar amount of either assessed or final penalties within the five year time period  # noqa: E501

        :param total_penalties: The total_penalties of this Air08.
        :type total_penalties: str
        """
        if total_penalties is None:
            raise ValueError("Invalid value for `total_penalties`, must not be `None`")  # noqa: E501

        self._total_penalties = total_penalties

    @property
    def v3_rows(self) -> str:
        """Gets the v3_rows of this Air08.

        Number of facilities having one or more quarters in non-compliance (QNC) in the last three years  # noqa: E501

        :return: The v3_rows of this Air08.
        :rtype: str
        """
        return self._v3_rows

    @v3_rows.setter
    def v3_rows(self, v3_rows: str):
        """Sets the v3_rows of this Air08.

        Number of facilities having one or more quarters in non-compliance (QNC) in the last three years  # noqa: E501

        :param v3_rows: The v3_rows of this Air08.
        :type v3_rows: str
        """
        if v3_rows is None:
            raise ValueError("Invalid value for `v3_rows`, must not be `None`")  # noqa: E501

        self._v3_rows = v3_rows